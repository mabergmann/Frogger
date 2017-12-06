
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Janela extends javax.swing.JFrame implements KeyListener {

    private GridBagConstraints gbc = new GridBagConstraints();
    private GridBagLayout gridbag = new GridBagLayout();
    private JLayeredPane painelEmCamadas = new JLayeredPane();
    private JPanel componentesMoveis = new JPanel();
    private JLabel lblPersonagem = new JLabel();
    static PainelDeJogo componentesEstaticos = new PainelDeJogo();
    private int janelaAtual = 0;
    private int tempo;
    private Jogador jogador;
    private Pista[] pistas = new Pista[6]; // 2 Calçadas + 4 Asfaltos = 6 Pistas
    boolean podeIniciar = false; // Serve para verificar se já devemos começar o jogo, se torna true ao clicar no botão start.

    public static void main(String args[]) throws IOException {
        new Janela();
    }

    public Janela() throws IOException {
        initComponents();
        this.addKeyListener(this);
        this.setSize(640, 480);
        this.setVisible(true);

        inicializaPistas();
        
        jogador = new Jogador(lblPersonagem);

        mostraMenu();
        
        iniciaJogo();
        
        mostraMenuPosJogo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnStartGame = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Frogger");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblTitulo.setText("Frogger");

        btnStartGame.setText("Start");
        btnStartGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartGameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(btnStartGame)))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(btnStartGame)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicializaPistas() throws IOException {
        
        pistas[5] = new Calcada();
        pistas[5].setLabel(componentesEstaticos.getCalcada1());
        
        pistas[4] = new Asfalto();
        pistas[4].setLabel(componentesEstaticos.getAsfalto1());

        pistas[3] = new Asfalto();
        pistas[3].setLabel(componentesEstaticos.getAsfalto2());

        pistas[2] = new Asfalto();
        pistas[2].setLabel(componentesEstaticos.getAsfalto3());

        pistas[1] = new Asfalto();
        pistas[1].setLabel(componentesEstaticos.getAsfalto4());

        pistas[0] = new Calcada();
        pistas[0].setLabel(componentesEstaticos.getCalcada2());
        
        /*double pesos[][] = gridbag.getLayoutWeights();
        for(index = 1; index < pesos[index].length; index++){
            pesos[index][0] = 0;
        }*/
        
        int index = 0;
        for (Pista pista : pistas) {
            if (pista instanceof Asfalto) {
                if(index == 1){
                    pista.setBackground(ImageIO.read(new File("imagens/AsfaltoPistaBordaInferior.png")));
                } else {
                    if(index == (pistas.length - 2)){
                        pista.setBackground(ImageIO.read(new File("imagens/AsfaltoPistaBordaSuperior.png")));
                    } else {
                        pista.setBackground(ImageIO.read(new File("imagens/AsfaltoPistaPista.png")));
                    }
                }
            } else {
                pista.setBackground(ImageIO.read(new File("imagens/calcadaTeste.png")));
            }
            index++;
            
        }
    }

     private void inicializaBarraDeInformacao() {
        componentesEstaticos.setIconeBarraInferior(new ImageIcon("imagens/Barra2.png"));
        componentesEstaticos.setIconeBarraSuperior(new ImageIcon("imagens/Barra2.png"));
    }

    private void btnStartGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartGameActionPerformed
        // TODO add your handling code here:
        podeIniciar = true;
        configuraElementosEstaticos();
        configuraElementosMoveis();
        painelEmCamadas.add(componentesEstaticos, 0);
        painelEmCamadas.add(componentesMoveis, 1);
        painelEmCamadas.setAlignmentX(LEFT_ALIGNMENT);
        painelEmCamadas.setAlignmentY(TOP_ALIGNMENT);

        getContentPane().removeAll();
        setContentPane(painelEmCamadas);
        add(lblPersonagem, 0);
        validate();
        repaint();
        janelaAtual = 1;
        this.requestFocus();

    }//GEN-LAST:event_btnStartGameActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        if (janelaAtual == 1) {
            add(lblPersonagem, 0);
            revalidate();
            repaint();
        }
    }//GEN-LAST:event_formComponentResized

    public void atualizaJanela() {
        lblPersonagem.setLocation(0, 0);
        this.repaint();
    }

    void mostraMenu() {
        while (!podeIniciar) {
            System.out.println("Esperando o botão start ser apertado...");
        }
    }

    public boolean getPodeiniciar() {
        return podeIniciar;
    }

    public void setPodeiniciar(boolean podeiniciar) {
        this.podeIniciar = podeiniciar;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    void iniciaJogo() {
        
        while(jogador.getPosicaoVertical()!=5){
        
            System.out.println("Jogando...");
        }
        
        System.out.println("Fim de Jogo - Você chegou ao final.");
    }

    void mostraMenuPosJogo() {
        System.out.println("Mostra seu pontos.");
    }

    void configuraElementosEstaticos() {
        gbc.gridwidth=0;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gridbag.addLayoutComponent(componentesEstaticos.getCalcada1(), gbc);
        
        gbc.gridy = 1;
        gridbag.addLayoutComponent(componentesEstaticos.getAsfalto1(), gbc);
        
        gbc.gridy = 2;
        gridbag.addLayoutComponent(componentesEstaticos.getAsfalto2(), gbc);
        
        gbc.gridy = 3;
        gridbag.addLayoutComponent(componentesEstaticos.getAsfalto3(), gbc);
        
        gbc.gridy = 4;
        gridbag.addLayoutComponent(componentesEstaticos.getAsfalto4(), gbc);
        
        gbc.gridy = 5;
        gridbag.addLayoutComponent(componentesEstaticos.getCalcada2(), gbc);
        
        componentesEstaticos.setLayout(gridbag);
        componentesEstaticos.setBounds(0, 0, 640, 480);

    }

    void configuraElementosMoveis() {
        componentesMoveis.setLayout(null);
        componentesMoveis.add(lblPersonagem);
        jogador.atualizaPosicao();
        componentesMoveis.setBounds(0, 0, getWidth(), getHeight());
    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                jogador.moveCima();
                break;

            case KeyEvent.VK_DOWN:
                jogador.moveBaixo();
                break;

            case KeyEvent.VK_LEFT:
                jogador.moveEsquerda();
                break;

            case KeyEvent.VK_RIGHT:
                jogador.moveDireita();
                break;

        }
    }

    public void keyReleased(KeyEvent e) {

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton btnStartGame;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables

}
