import java.awt.Color;
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
import javax.swing.JProgressBar;

public class Janela extends javax.swing.JFrame implements KeyListener {

    private final GridBagConstraints gbc = new GridBagConstraints();
    private final GridBagLayout gridbag = new GridBagLayout();
    private final JLayeredPane painelEmCamadas = new JLayeredPane();

    JLabel coracao1;
    JLabel coracao2;
    JLabel coracao3;

    JProgressBar barraDeTempo;

    private final JLabel lblPersonagem = new JLabel();

    private final ImageIcon titulo = new ImageIcon(ImageIO.read(new File("imagens/titulo.png")).getScaledInstance(400, 160, Image.SCALE_SMOOTH));

    private final PainelDeJogo componentesEstaticos = new PainelDeJogo();
    private final Tutorial janelaTutorial = new Tutorial(this);
    private final Ranking painelRanking = new Ranking(this);
    private final MenuFimDeJogo painelMenuFinal = new MenuFimDeJogo(this);

    private int nivel = 0;

    JLabel lblNivel = new JLabel();
    JLabel lblPontos = new JLabel();

    private Jogador jogador;

    private final Pista[] pistas = new Pista[6]; // 2 Calçadas + 4 Asfaltos = 6 Pistas

    public static void main(String args[]) throws IOException, InterruptedException {
        new Janela();
    }

    public Janela() throws IOException, InterruptedException {
        initComponents();
        this.addKeyListener(this);
        this.setSize(640, 480);
        this.setVisible(true);
        this.setResizable(false);

        lblTitulo.setIcon(titulo);

        mostraMenu();

    }

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

        btnStartGame.setText("Jogar");
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
        
        setNivel(1);

        inicializaBarras();

        validate();
        repaint();

        loopDeJogo();
    }

    private void inicializaPistas() throws IOException {

        pistas[5] = new Calcada();
        pistas[5].setLabel(componentesEstaticos.getCalcada1());

        pistas[4] = new Asfalto(4, Asfalto.DIREITA, 20);
        pistas[4].setLabel(componentesEstaticos.getAsfalto1());

        pistas[3] = new Asfalto(3, Asfalto.DIREITA, 20);
        pistas[3].setLabel(componentesEstaticos.getAsfalto2());

        pistas[2] = new Asfalto(2, Asfalto.ESQUERDA, 30);
        pistas[2].setLabel(componentesEstaticos.getAsfalto3());

        pistas[1] = new Asfalto(1, Asfalto.ESQUERDA, 10);
        pistas[1].setLabel(componentesEstaticos.getAsfalto4());

        pistas[0] = new Calcada();
        pistas[0].setLabel(componentesEstaticos.getCalcada2());

        pistas[5].setBackground(ImageIO.read(new File("imagens/calcadaTeste.png")));
        pistas[4].setBackground(ImageIO.read(new File("imagens/AsfaltoFaixaBordaSuperior.png")));
        pistas[3].setBackground(ImageIO.read(new File("imagens/AsfaltoFaixaPista.png")));
        pistas[2].setBackground(ImageIO.read(new File("imagens/AsfaltoPistaFaixa.png")));
        pistas[1].setBackground(ImageIO.read(new File("imagens/AsfaltoFaixaBordaInferior.png")));
        pistas[0].setBackground(ImageIO.read(new File("imagens/calcadaTeste.png")));
    }


    private void btnStartGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartGameActionPerformed
        novoJogo();
    }//GEN-LAST:event_btnStartGameActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
    }//GEN-LAST:event_formComponentResized

    private void btnTutorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTutorialActionPerformed
        setContentPane(janelaTutorial);
        revalidate();
        repaint();
    }//GEN-LAST:event_btnTutorialActionPerformed

    private void btnRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRankingActionPerformed
        painelRanking.imprimirRecordes();
        setContentPane(painelRanking);
        revalidate();
        repaint();
    }//GEN-LAST:event_btnRankingActionPerformed

    void mostraMenu() {
        setContentPane(painelDoMenuInicial);
        revalidate();
        repaint();
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Ranking getPainelRanking() {
        return painelRanking;
    }

    public Jogador getJogador() {
        return jogador;
    }

    void loopDeJogo() throws IOException, InterruptedException {

        while (jogador.vivo()) {
            if (jogador.chegouAoFim()) {
                proximoNivel();
            }

            barraDeTempo.setValue((int) calculaValorDaBarra(jogador, barraDeTempo));

            verificaCoracoes();

            for (Pista pista : pistas) {
                if (pista instanceof Asfalto) {
                    Asfalto asfalto = (Asfalto) pista;
                    asfalto.excluiVeiculosAntigos(); // Apaga os veículos que já saíram da pista
                }
            }

            int pista = jogador.getPista();
            pista = validaPista(pista);
            Pista pistaAtual = pistas[pista];

            if (pistaAtual.estaColidindo(jogador.getPosicaoHorizontal(), jogador.getLargura())) {
                jogador.matar();
            }

            veiculosTrocaPista();

            gerarVeiculos();
            Thread.sleep(50);
        }
    }

    private int validaPista(int pista) {
        if (pista < 0) // Caso tenha matado a sapo no meio do movimento
        {
            pista = 0;
        }
        if(pista>5){
            pista=5;
        }
        return pista;
    }

    private void proximoNivel() {
        getJogador().proximaFase(nivel);
        setNivel(getNivel() + 1);
        aumentaVelocidadeDasFaixas();
        lblNivel.setText("Nível " + Integer.toString(nivel));
        lblPontos.setText("Pontuação: " + Integer.toString(jogador.getPontuacao()));
    }

    float calculaValorDaBarra(Jogador jogador, JProgressBar barra) {
        float retorno = (float) (6.7 * (15 - jogador.getTempoEmSegundos()));
        if (retorno <= 0) {
            retorno = 0;
            jogador.setTempoInicio(System.currentTimeMillis());
            jogador.matar();
        }

        if (retorno <= 35) {
            barra.setForeground(Color.red);
        } else {
            barra.setForeground(Color.green);
        }

        return retorno;
    }

    void verificaCoracoes() {

        switch (this.getJogador().getVida()) {
            case 3:
                coracao1.setVisible(true);
                coracao2.setVisible(true);
                coracao3.setVisible(true);
                break;
            case 2:
                coracao1.setVisible(true);
                coracao2.setVisible(true);
                coracao3.setVisible(false);
                break;
            case 1:
                coracao1.setVisible(true);
                coracao2.setVisible(false);
                coracao3.setVisible(false);
                break;
        }
    }

    void mostraMenuPosJogo() {
        painelMenuFinal.getLblPontuacao().setText("Você fez " + Integer.toString(jogador.getPontuacao()) + " pontos!");
        if (painelRanking.entrouNoRanking(jogador.getPontuacao())) {
            painelMenuFinal.getBoxNome().setVisible(true);
            painelMenuFinal.getLblAvisoRanking().setVisible(true);
            painelMenuFinal.getBtnRegistrar().setVisible(true);
            painelMenuFinal.getBtnRegistrar().setEnabled(true);
        } else {
            painelMenuFinal.getBoxNome().setVisible(false);
            painelMenuFinal.getLblAvisoRanking().setVisible(false);
            painelMenuFinal.getBtnRegistrar().setVisible(false);
        }
        setContentPane(painelMenuFinal);
        revalidate();
        repaint();
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

        painelEmCamadas.add(componentesEstaticos, 1);
        painelEmCamadas.setAlignmentX(LEFT_ALIGNMENT);
        painelEmCamadas.setAlignmentY(TOP_ALIGNMENT);
        //painelEmCamadas.add(componentesEstaticos.getBarraSuperior(), 1);
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

    private void veiculosTrocaPista() {

        Random random = new Random();
        Veiculo veiculo = null;
        Asfalto origem;
        Asfalto destino;
        int novaFaixa;

        int probabilidade = random.nextInt(10);

        if (probabilidade == 0) {

            int faixa = 1 + (random.nextInt(4));
            switch (faixa) {
                case 1:
                    origem = (Asfalto) pistas[1];
                    destino = (Asfalto) pistas[2];

                    novaFaixa = 2;

                    break;
                case 2:
                    origem = (Asfalto) pistas[2];
                    destino = (Asfalto) pistas[1];
                    novaFaixa = 1;
                    break;
                case 3:
                    origem = (Asfalto) pistas[3];
                    destino = (Asfalto) pistas[4];
                    novaFaixa = 4;
                    break;
                default:
                    origem = (Asfalto) pistas[4];
                    destino = (Asfalto) pistas[3];
                    novaFaixa = 3;
                    break;
            }

            if (origem.temVeiculoNaPista()) {
                veiculo = origem.EscolheUmVeiculo();
                if (!destino.estaColidindo(veiculo.getPosicaoHorizontal(), veiculo.getLargura())) {
                    origem.removeVeiculo(veiculo);
                    veiculo.iniciaTrocaDePista(novaFaixa);
                    destino.insereEsseVeiculo(veiculo);
                }
            }
        }
    }

    public void novoJogo() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    inicializaJogo();
                } catch (IOException | InterruptedException ex) {
                    Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
                }

                mostraMenuPosJogo();
            }
        });
        thread.start();
    }

    private void aumentaVelocidadeDasFaixas() {
        for (Pista pista : pistas) {
            if (pista instanceof Asfalto) {
                Asfalto asfalto = (Asfalto) pista;
                asfalto.aumentarVelocidade();
            }
        }
    }

    private void inicializaBarras() {
        JLabel barraTopo = new JLabel();
        JLabel barraBase = new JLabel();
        coracao1 = new JLabel();
        coracao2 = new JLabel();
        coracao3 = new JLabel();
        JLabel lblRotuloTempo = new JLabel();
        JLabel lblTitulo = new JLabel();
        barraDeTempo = new JProgressBar();
        
        adicionaBarras(barraTopo, barraBase, lblRotuloTempo, lblTitulo);
        
        setTamanhoBarras(barraTopo, barraBase, lblRotuloTempo, lblTitulo);
        
        setTextoLabels(lblRotuloTempo, lblTitulo);

        barraDeTempo.setForeground(Color.green);
        barraDeTempo.setValue(100);

        setIconesBarras(barraTopo, barraBase);

    }

    private void setIconesBarras(JLabel barraTopo, JLabel barraBase) {
        try {
            barraTopo.setIcon(new ImageIcon(ImageIO.read(new File("imagens/barra2.png")).getScaledInstance(640, 20, Image.SCALE_SMOOTH)));
            barraBase.setIcon(new ImageIcon(ImageIO.read(new File("imagens/barra2.png")).getScaledInstance(640, 20, Image.SCALE_SMOOTH)));
            coracao1.setIcon(new ImageIcon(ImageIO.read(new File("imagens/coracao.png")).getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
            coracao2.setIcon(new ImageIcon(ImageIO.read(new File("imagens/coracao.png")).getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
            coracao3.setIcon(new ImageIcon(ImageIO.read(new File("imagens/coracao.png")).getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
        } catch (IOException ex) {
            Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setTextoLabels(JLabel lblRotuloTempo, JLabel lblTitulo1) {
        lblRotuloTempo.setText("Tempo");
        lblNivel.setText("Nível 1");
        lblPontos.setText("Pontuação: 0");
        lblTitulo1.setText("FROGGER");
    }

    private void setTamanhoBarras(JLabel barraTopo, JLabel barraBase, JLabel lblRotuloTempo, JLabel lblTitulo1) {
        barraTopo.setBounds(0, 0, 640, 20);
        barraBase.setBounds(0, 430, 640, 20);
        coracao1.setBounds(15, 425, 30, 30);
        coracao2.setBounds(40, 425, 30, 30);
        coracao3.setBounds(65, 425, 30, 30);
        lblRotuloTempo.setBounds(220, 432, 50, 15);
        barraDeTempo.setBounds(270, 432, 300, 15);
        lblNivel.setBounds(15, 2, 100, 15);
        lblPontos.setBounds(400, 2, 240, 15);
        lblTitulo1.setBounds(270, 2, 100, 15);
    }

    private void adicionaBarras(JLabel barraTopo, JLabel barraBase, JLabel lblRotuloTempo, JLabel lblTitulo1) {
        add(barraTopo, 0);
        add(barraBase, 0);
        add(coracao1, 0);
        add(coracao2, 0);
        add(coracao3, 0);
        add(lblRotuloTempo, 0);
        add(lblNivel, 0);
        add(lblPontos, 0);
        add(lblTitulo1, 0);
        add(barraDeTempo, 0);
    }

}
