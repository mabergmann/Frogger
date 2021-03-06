
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Tutorial extends javax.swing.JPanel {

    private final ImageIcon sapo;
    private final ImageIcon carro;
    private final ImageIcon moto;
    private final ImageIcon caminhao;
    private final ImageIcon teclas;
    private final ImageIcon coracao;
    private final ImageIcon barraTempo;
    private Janela janelaPai;

    public Tutorial(Janela janela) throws IOException {
        this.sapo = new ImageIcon(ImageIO.read(new File("imagens/sapoTras1.png")).getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        this.carro = new ImageIcon(ImageIO.read(new File("imagens/carro.png")).getScaledInstance(95, 65, Image.SCALE_SMOOTH));
        this.moto = new ImageIcon(ImageIO.read(new File("imagens/moto.png")).getScaledInstance(80, 60, Image.SCALE_SMOOTH));
        this.caminhao = new ImageIcon(ImageIO.read(new File("imagens/caminhao.png")).getScaledInstance(120, 85, Image.SCALE_SMOOTH));
        this.teclas = new ImageIcon(ImageIO.read(new File("imagens/teclas.png")).getScaledInstance(140, 100, Image.SCALE_SMOOTH));
        this.coracao = new ImageIcon(ImageIO.read(new File("imagens/coracao.png")).getScaledInstance(80, 80, Image.SCALE_SMOOTH));
        this.barraTempo = new ImageIcon(ImageIO.read(new File("imagens/barraDeTempo.png")).getScaledInstance(160, 19, Image.SCALE_SMOOTH));

        initComponents();

        lblJogador.setIcon(sapo);
        lblCarro.setIcon(carro);
        lblMoto.setIcon(moto);
        lblCaminhao.setIcon(caminhao);
        lblTeclas.setIcon(teclas);
        lblCoracao.setIcon(coracao);
        lblTempo.setIcon(barraTempo);

        textoSapo.setText("<html>O seu objetivo é fazer com que o sapo atravesse a rua em segurança.</html)");
        textoTeclas.setText("<html>Utilize as setas do teclado para se movimentar pelas pistas.</html)");
        textoVeiculos.setText("<html>Há três tipos de veículos andando sobre as pistas: carros, motos e caminhões.<br>Evite ser atropelado por eles!</html)");
        textoVidas1.setText("<html>Você inicia cada fase tendo 3 vidas...</html>");
        textoVidas2.setText("<html>Concluir uma fase sem perder nenhuma vida lhe dará pontos extras!</html)");
        textoTempo.setText("<html>Cuidado: você tem apenas 15 segundos para completar cada nível. Fique de olho na barra de tempo!<br>Quanto mais rapido você completar, maior será sua pontuação.</html>");
        textoNivel.setText("<html>A cada nível, a velocidade dos veículos aumenta. Níveis maiores rendem mais pontos.</html>");
        this.setJanelaPai(janela);
    }

    public void setJanelaPai(Janela janelaPai) {
        this.janelaPai = janelaPai;
    }

    public Janela getJanelaPai() {
        return janelaPai;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textArea1 = new java.awt.TextArea();
        lblTeclas = new javax.swing.JLabel();
        lblCarro = new javax.swing.JLabel();
        lblMoto = new javax.swing.JLabel();
        lblCaminhao = new javax.swing.JLabel();
        lblJogador = new javax.swing.JLabel();
        lblCoracao = new javax.swing.JLabel();
        textoSapo = new javax.swing.JLabel();
        textoTeclas = new javax.swing.JLabel();
        textoVeiculos = new javax.swing.JLabel();
        textoVidas2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        textoTempo = new javax.swing.JLabel();
        textoVidas1 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        textoNivel = new javax.swing.JLabel();
        lblTempo = new javax.swing.JLabel();

        lblTeclas.setPreferredSize(new java.awt.Dimension(100, 100));

        lblCarro.setMaximumSize(new java.awt.Dimension(200, 200));
        lblCarro.setPreferredSize(new java.awt.Dimension(100, 100));

        lblMoto.setMaximumSize(new java.awt.Dimension(200, 200));
        lblMoto.setPreferredSize(new java.awt.Dimension(100, 100));

        lblJogador.setMaximumSize(new java.awt.Dimension(200, 200));
        lblJogador.setPreferredSize(new java.awt.Dimension(100, 100));

        textoSapo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        textoSapo.setText("texto do sapo");

        textoTeclas.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        textoTeclas.setText("texto das teclas");

        textoVeiculos.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        textoVeiculos.setText("texto dos veículos");

        textoVidas2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        textoVidas2.setText("texto das vidas 2");
        textoVidas2.setMinimumSize(new java.awt.Dimension(50, 19));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel1.setText("Instruções");

        textoTempo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        textoTempo.setText("textoTempo");

        textoVidas1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        textoVidas1.setText("texto das vidas 1");

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        textoNivel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        textoNivel.setText("textoNivel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTeclas, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoTeclas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblJogador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoSapo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(textoVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCaminhao, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblCoracao, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textoVidas1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoVidas2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnVoltar)
                                .addGap(17, 17, 17)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textoNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoVidas1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCoracao, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoVidas2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoSapo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTeclas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoTeclas, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblCaminhao, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltar)
                        .addGap(27, 27, 27))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        getJanelaPai().mostraMenu();
    }//GEN-LAST:event_btnVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCaminhao;
    private javax.swing.JLabel lblCarro;
    private javax.swing.JLabel lblCoracao;
    private javax.swing.JLabel lblJogador;
    private javax.swing.JLabel lblMoto;
    private javax.swing.JLabel lblTeclas;
    private javax.swing.JLabel lblTempo;
    private java.awt.TextArea textArea1;
    private javax.swing.JLabel textoNivel;
    private javax.swing.JLabel textoSapo;
    private javax.swing.JLabel textoTeclas;
    private javax.swing.JLabel textoTempo;
    private javax.swing.JLabel textoVeiculos;
    private javax.swing.JLabel textoVidas1;
    private javax.swing.JLabel textoVidas2;
    // End of variables declaration//GEN-END:variables
}
