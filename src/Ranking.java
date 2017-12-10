
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Júlia
 */
public class Ranking extends javax.swing.JPanel {

    private final ImageIcon um;
    private final ImageIcon dois;
    private final ImageIcon tres;
    private final ImageIcon quatro;
    private final ImageIcon cinco;
    private final ImageIcon seis;
    private final ImageIcon sete;
    private final ImageIcon oito;
    private final ImageIcon nove;
    private final ImageIcon dez;
    
    /**
     * Creates new form Ranking
     * @throws java.io.IOException
     */
    public Ranking() throws IOException {
        initComponents();
        this.um = new ImageIcon(ImageIO.read(new File("imagens/primeiro.png")).getScaledInstance(22, 21, Image.SCALE_SMOOTH));
        this.dois = new ImageIcon(ImageIO.read(new File("imagens/segundo.png")).getScaledInstance(22, 21, Image.SCALE_SMOOTH));
        this.tres = new ImageIcon(ImageIO.read(new File("imagens/terceiro.png")).getScaledInstance(22, 21, Image.SCALE_SMOOTH));
        this.quatro = new ImageIcon(ImageIO.read(new File("imagens/quarto.png")).getScaledInstance(22, 21, Image.SCALE_SMOOTH));
        this.cinco = new ImageIcon(ImageIO.read(new File("imagens/quinto.png")).getScaledInstance(22, 21, Image.SCALE_SMOOTH));
        this.seis = new ImageIcon(ImageIO.read(new File("imagens/sexto.png")).getScaledInstance(22, 21, Image.SCALE_SMOOTH));
        this.sete = new ImageIcon(ImageIO.read(new File("imagens/setimo.png")).getScaledInstance(22, 21, Image.SCALE_SMOOTH));
        this.oito = new ImageIcon(ImageIO.read(new File("imagens/oitavo.png")).getScaledInstance(22, 21, Image.SCALE_SMOOTH));
        this.nove = new ImageIcon(ImageIO.read(new File("imagens/nono.png")).getScaledInstance(22, 21, Image.SCALE_SMOOTH));
        this.dez = new ImageIcon(ImageIO.read(new File("imagens/decimo.png")).getScaledInstance(22, 21, Image.SCALE_SMOOTH));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRanking = new javax.swing.JLabel();
        lblPrimeiro = new javax.swing.JLabel();
        lblSegundo = new javax.swing.JLabel();
        lblTerceiro = new javax.swing.JLabel();
        lblQuarto = new javax.swing.JLabel();
        lblQuinto = new javax.swing.JLabel();
        lblSexto = new javax.swing.JLabel();
        lblSetimo = new javax.swing.JLabel();
        lblOitavo = new javax.swing.JLabel();
        lblNono = new javax.swing.JLabel();
        lblDecimo = new javax.swing.JLabel();
        lblNomePrimeiro = new javax.swing.JLabel();
        lblNomeSegundo = new javax.swing.JLabel();
        lblNomeTerceiro = new javax.swing.JLabel();
        lblNomeQuarto = new javax.swing.JLabel();
        lblNomeQuinto = new javax.swing.JLabel();
        lblNomeSexto = new javax.swing.JLabel();
        lblNomeSetimo = new javax.swing.JLabel();
        lblNomeOitavo = new javax.swing.JLabel();
        lblNomeNono = new javax.swing.JLabel();
        lblNomeDecimo = new javax.swing.JLabel();

        lblRanking.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        lblRanking.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRanking.setText("Ranking");

        lblPrimeiro.setText("primeiro");

        lblSegundo.setText("primeiro");

        lblTerceiro.setText("primeiro");

        lblQuarto.setText("primeiro");

        lblQuinto.setText("primeiro");

        lblSexto.setText("primeiro");

        lblSetimo.setText("primeiro");

        lblOitavo.setText("primeiro");

        lblNono.setText("primeiro");

        lblDecimo.setText("primeiro");

        lblNomePrimeiro.setText("Jogador1 - xxxxxxx");

        lblNomeSegundo.setText("Jogador2 - xxxxxxx");

        lblNomeTerceiro.setText("Jogador3 - xxxxxxx");

        lblNomeQuarto.setText("Jogador4 - xxxxxxx");

        lblNomeQuinto.setText("Jogador5 - xxxxxxx");

        lblNomeSexto.setText("Jogador6 - xxxxxxx");

        lblNomeSetimo.setText("Jogador7 - xxxxxxx");

        lblNomeOitavo.setText("Jogador8 - xxxxxxx");

        lblNomeNono.setText("Jogador9 - xxxxxxx");

        lblNomeDecimo.setText("Jogador10 - xxxxxxx");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDecimo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTerceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQuinto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSexto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSetimo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOitavo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblNono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomePrimeiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNomeSegundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNomeTerceiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNomeQuarto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNomeQuinto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNomeSexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNomeSetimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNomeOitavo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNomeNono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNomeDecimo, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(lblRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomePrimeiro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNomeSegundo)
                    .addComponent(lblSegundo, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNomeTerceiro)
                    .addComponent(lblTerceiro, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNomeQuarto)
                    .addComponent(lblQuarto, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNomeQuinto)
                    .addComponent(lblQuinto, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNomeSexto)
                    .addComponent(lblSexto, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNomeSetimo)
                    .addComponent(lblSetimo, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNomeOitavo)
                    .addComponent(lblOitavo, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNomeNono)
                    .addComponent(lblNono, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNomeDecimo)
                    .addComponent(lblDecimo, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                .addGap(51, 51, 51))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblDecimo;
    private javax.swing.JLabel lblNomeDecimo;
    private javax.swing.JLabel lblNomeNono;
    private javax.swing.JLabel lblNomeOitavo;
    private javax.swing.JLabel lblNomePrimeiro;
    private javax.swing.JLabel lblNomeQuarto;
    private javax.swing.JLabel lblNomeQuinto;
    private javax.swing.JLabel lblNomeSegundo;
    private javax.swing.JLabel lblNomeSetimo;
    private javax.swing.JLabel lblNomeSexto;
    private javax.swing.JLabel lblNomeTerceiro;
    private javax.swing.JLabel lblNono;
    private javax.swing.JLabel lblOitavo;
    private javax.swing.JLabel lblPrimeiro;
    private javax.swing.JLabel lblQuarto;
    private javax.swing.JLabel lblQuinto;
    private javax.swing.JLabel lblRanking;
    private javax.swing.JLabel lblSegundo;
    private javax.swing.JLabel lblSetimo;
    private javax.swing.JLabel lblSexto;
    private javax.swing.JLabel lblTerceiro;
    // End of variables declaration//GEN-END:variables
}
