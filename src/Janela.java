
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
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
    private Jogador jogador = new Jogador();
    private Pista[] pistas = new Pista[5]; // 2 Calçadas + 3 Asfaltos = 5 Pistas
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
        inicializaJogador();

        jogador.setVida(1);
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
        pistas[4] = new Calcada();
        pistas[4].setLabel(componentesEstaticos.getCalcada1());

        pistas[3] = new Asfalto();
        pistas[3].setLabel(componentesEstaticos.getAsfalto1());

        pistas[2] = new Asfalto();
        pistas[2].setLabel(componentesEstaticos.getAsfalto2());

        pistas[1] = new Asfalto();
        pistas[1].setLabel(componentesEstaticos.getAsfalto3());

        pistas[0] = new Calcada();
        pistas[0].setLabel(componentesEstaticos.getCalcada2());

        for (Pista pista : pistas) {
            if (pista instanceof Asfalto) {
                pista.setBackground(ImageIO.read(new File("imagens/asfalto.png")));
            } else {
                pista.setBackground(ImageIO.read(new File("imagens/calcada.png")));
            }
        }
    }

    private void inicializaJogador() throws IOException {
        jogador = new Jogador();
        jogador.setPosicao(200, 0);
        jogador.setTamanho(50, 50);
        jogador.setLabel(lblPersonagem);
        jogador.setImagem(ImageIO.read(new File("imagens/jogador.png")));
    }

    private void btnStartGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartGameActionPerformed
        // TODO add your handling code here:
        //jogoFrogger.setPodeiniciar(true);
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
        System.out.println("Iniciou o jogo.");
    }

    void mostraMenuPosJogo() {
        System.out.println("mostra menu");
    }

    void configuraElementosEstaticos() {
        //gbc.anchor  = GridBagConstraints.NORTHWEST;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gridbag.addLayoutComponent(componentesEstaticos.getCalcada1(), gbc);
        //gridbag.addLayoutComponent(calcada2, gbc);
        gbc.gridy = 1;
        gridbag.addLayoutComponent(componentesEstaticos.getAsfalto3(), gbc);
        //gridbag.addLayoutComponent(asfalto3, gbc);
        gbc.gridy = 2;
        gridbag.addLayoutComponent(componentesEstaticos.getAsfalto1(), gbc);
        //gridbag.addLayoutComponent(asfalto2, gbc);
        gbc.gridy = 3;
        gridbag.addLayoutComponent(componentesEstaticos.getAsfalto2(), gbc);
        //gridbag.addLayoutComponent(asfalto1, gbc);
        gbc.gridy = 4;
        gridbag.addLayoutComponent(componentesEstaticos.getCalcada2(), gbc);
        //gridbag.addLayoutComponent(calcada1, gbc);
        //gridbag.setConstraints(this, gbc);
        componentesEstaticos.setLayout(gridbag);
        //componentesEstaticos.setBounds(0, 0, janela.getWidth(), janela.getHeight());
        componentesEstaticos.setBounds(0, 0, 400, 300); //posixLblJogador*2, posiyLblJogador);

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
