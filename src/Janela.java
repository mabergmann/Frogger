
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;

public class Janela extends javax.swing.JFrame implements KeyListener {

    private final GridBagConstraints gbc = new GridBagConstraints();
    private final GridBagLayout gridbag = new GridBagLayout();
    private final JLayeredPane painelEmCamadas = new JLayeredPane();

    private final JLabel lblPersonagem = new JLabel();
    //private JLabel carro1 = new JLabel();
    //private JLabel carro2 = new JLabel();
    //private JLabel carro3 = new JLabel();
    //private JLabel carro4 = new JLabel();
    //private JLabel moto1 = new JLabel();
    //private JLabel moto2 = new JLabel();
    //private JLabel caminhao1 = new JLabel();
    //private JLabel caminhao2 = new JLabel();

    private ImageIcon titulo = new ImageIcon(ImageIO.read(new File("imagens/titulo.png")).getScaledInstance(400, 160, Image.SCALE_SMOOTH));

    static PainelDeJogo componentesEstaticos = new PainelDeJogo();

    private Tutorial janelaTutorial = new Tutorial(this);

    private int tempo;

    private Jogador jogador;

    private Pista[] pistas = new Pista[6]; // 2 Calçadas + 4 Asfaltos = 6 Pistas

    boolean podeIniciar = false; // Serve para verificar se já devemos começar o jogo, se torna true ao clicar no botão start.

    public static void main(String args[]) throws IOException, InterruptedException {
        new Janela();
    }

    public Janela() throws IOException, InterruptedException {
        initComponents();
        this.addKeyListener(this);
        this.setSize(640, 480);
        this.setVisible(true);

        lblTitulo.setIcon(titulo);

        mostraMenu();

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
        jLabel1 = new javax.swing.JLabel();
        painelDoMenuInicial = new javax.swing.JPanel();
        btnStartGame = new javax.swing.JButton();
        btnRanking = new javax.swing.JButton();
        btnTutorial = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();

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

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Frogger");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        btnStartGame.setText("Start");
        btnStartGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartGameActionPerformed(evt);
            }
        });

        btnRanking.setText("Ranking");
        btnRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRankingActionPerformed(evt);
            }
        });

        btnTutorial.setText("Tutorial");
        btnTutorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTutorialActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblTitulo.setPreferredSize(new java.awt.Dimension(400, 160));

        javax.swing.GroupLayout painelDoMenuInicialLayout = new javax.swing.GroupLayout(painelDoMenuInicial);
        painelDoMenuInicial.setLayout(painelDoMenuInicialLayout);
        painelDoMenuInicialLayout.setHorizontalGroup(
            painelDoMenuInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDoMenuInicialLayout.createSequentialGroup()
                .addGroup(painelDoMenuInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDoMenuInicialLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelDoMenuInicialLayout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addGroup(painelDoMenuInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnStartGame, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTutorial, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        painelDoMenuInicialLayout.setVerticalGroup(
            painelDoMenuInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDoMenuInicialLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(btnStartGame)
                .addGap(29, 29, 29)
                .addComponent(btnRanking)
                .addGap(27, 27, 27)
                .addComponent(btnTutorial)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelDoMenuInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelDoMenuInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicializaJogo() throws IOException, InterruptedException {
        inicializaPistas();

        inicializaElementos();

        jogador = new Jogador(lblPersonagem);

        validate();
        repaint();
        
        loopDeJogo();
    }

    private void inicializaPistas() throws IOException {

        pistas[5] = new Calcada();
        pistas[5].setLabel(componentesEstaticos.getCalcada1());

        pistas[4] = new Asfalto(4, Asfalto.DIREITA, 2);
        pistas[4].setLabel(componentesEstaticos.getAsfalto1());

        pistas[3] = new Asfalto(3, Asfalto.DIREITA, 2);
        pistas[3].setLabel(componentesEstaticos.getAsfalto2());

        pistas[2] = new Asfalto(2, Asfalto.ESQUERDA, 3);
        pistas[2].setLabel(componentesEstaticos.getAsfalto3());

        pistas[1] = new Asfalto(1, Asfalto.ESQUERDA, 1);
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
                if (index == 1) {
                    pista.setBackground(ImageIO.read(new File("imagens/AsfaltoPistaBordaInferior.png")));
                } else {
                    if (index == (pistas.length - 2)) {
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

        Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        inicializaJogo();
                    } catch (IOException ex) {
                        Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
            thread.start();
    }//GEN-LAST:event_btnStartGameActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
    }//GEN-LAST:event_formComponentResized

    private void btnTutorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTutorialActionPerformed
        setContentPane(janelaTutorial);
        revalidate();
        repaint();
        // while(!janelaTutorial.getVoltar()){
        //esperando botão "voltar" ser pressionado 
        //System.out.println("Esperando o botão voltar ser apertado...");
        //}
        //mostraMenu();
    }//GEN-LAST:event_btnTutorialActionPerformed

    private void btnRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRankingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRankingActionPerformed

    void mostraMenu() {
        setContentPane(painelDoMenuInicial);
        revalidate();
        repaint();
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

    void loopDeJogo() throws IOException, InterruptedException {
        while (jogador.vivo()) {
            for (Pista pista : pistas) {
                if (pista instanceof Asfalto) {
                    Asfalto asfalto = (Asfalto) pista;
                    asfalto.excluiVeiculosAntigos();
                }
            }
            int pista = jogador.getPista();
            if (pista < 0) // Caso tenha matado a sapo no meio do movimento
            {
                pista = 0;
            }
            Pista pistaAtual = pistas[pista];
            if (pistaAtual.estaColidindo(jogador.getPosicaoHorizontal(), jogador.getLargura())) {
                jogador.matar();
            }
            gerarVeiculos();
            Thread.sleep(50);
        }
        mostraMenuPosJogo();
    }

    void mostraMenuPosJogo() {
        System.out.println("Mostra seus pontos.");
    }

    void configuraElementosEstaticos() {
        gbc.gridwidth = 0;
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
    private javax.swing.JButton btnRanking;
    private static javax.swing.JButton btnStartGame;
    private static javax.swing.JButton btnTutorial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel painelDoMenuInicial;
    // End of variables declaration//GEN-END:variables

    private void inicializaElementos() {

        configuraElementosEstaticos();

        painelEmCamadas.add(componentesEstaticos, 0);
        painelEmCamadas.setAlignmentX(LEFT_ALIGNMENT);
        painelEmCamadas.setAlignmentY(TOP_ALIGNMENT);
        setContentPane(painelEmCamadas);

        add(lblPersonagem, 0);
        this.requestFocus();

    }

    private void gerarVeiculos() {

        Random random = new Random();
        int faixa = 1 + (random.nextInt(4));
        Asfalto asfalto = (Asfalto) pistas[faixa];
        if (asfalto.podeAdicionarVeiculo()) {
            JLabel label = new JLabel();
            add(label, 0);
            try {
                asfalto.inserirVeiculo(label);
            } catch (IOException ex) {
                Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
