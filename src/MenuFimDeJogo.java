
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MenuFimDeJogo extends javax.swing.JPanel {

    private final ImageIcon enterro;
    private Janela janelaPai;
    private String nome;

    public JTextField getBoxNome() {
        return boxNome;
    }

    public JButton getBtnRegistrar() {
        return btnRegistrar;
    }

    public JLabel getLblAvisoRanking() {
        return lblAvisoRanking;
    }

    public Janela getJanelaPai() {
        return this.janelaPai;
    }
    
    

    public MenuFimDeJogo(Janela janela) throws IOException {
        initComponents();
        this.enterro = new ImageIcon(ImageIO.read(new File("imagens/enterro.png")).getScaledInstance(320, 190, Image.SCALE_SMOOTH));

        lblEnterro.setIcon(enterro);

        this.janelaPai = janela;
    }

    public JLabel getLblPontuacao() {
        return lblPontuacao;
    }

    public String getNome() {
        return nome;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEnterro = new javax.swing.JLabel();
        lblFimDeJogo = new javax.swing.JLabel();
        lblPontuacao = new javax.swing.JLabel();
        btnJogarNovamente = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        boxNome = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        lblAvisoRanking = new javax.swing.JLabel();

        lblFimDeJogo.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblFimDeJogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFimDeJogo.setText("Fim de Jogo");

        lblPontuacao.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblPontuacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPontuacao.setText("Você fez XXXXX pontos!");

        btnJogarNovamente.setText("Jogar Novamente");
        btnJogarNovamente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogarNovamenteActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar ao Menu Inicial");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        boxNome.setForeground(new java.awt.Color(204, 204, 204));
        boxNome.setText("Insira seu nome aqui");
        boxNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boxNomeMouseClicked(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        lblAvisoRanking.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAvisoRanking.setText("E entrou para o Ranking!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(lblFimDeJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(lblEnterro, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnJogarNovamente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(lblPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(120, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(boxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistrar)
                        .addGap(196, 196, 196))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblAvisoRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(186, 186, 186))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lblEnterro, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFimDeJogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPontuacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAvisoRanking)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnJogarNovamente)
                .addGap(18, 18, 18)
                .addComponent(btnVoltar)
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void setJanelaPai(Janela parent) {
        this.janelaPai = parent;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private void btnJogarNovamenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogarNovamenteActionPerformed
        getJanelaPai().novoJogo();
    }//GEN-LAST:event_btnJogarNovamenteActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        getJanelaPai().mostraMenu();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        this.setNome(boxNome.getText());
        if (this.getNome().isEmpty()) {
            this.setNome("Desconhecido");
        }
        btnRegistrar.setEnabled(false);
        try {
            this.getJanelaPai().getPainelRanking().adicionarRecorde(this.getNome(), this.getJanelaPai().getJogador().getPontuacao());
        } catch (IOException ex) {
            Logger.getLogger(MenuFimDeJogo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void boxNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boxNomeMouseClicked
     
        this.getBoxNome().setText("");
        this.getBoxNome().setForeground(Color.black);
    }//GEN-LAST:event_boxNomeMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField boxNome;
    private javax.swing.JButton btnJogarNovamente;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblAvisoRanking;
    private javax.swing.JLabel lblEnterro;
    private javax.swing.JLabel lblFimDeJogo;
    private javax.swing.JLabel lblPontuacao;
    // End of variables declaration//GEN-END:variables
}
