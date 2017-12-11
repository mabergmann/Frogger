
import java.awt.Image;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

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
    private ArrayList<Pontuacao> pontuacoes = new ArrayList();

    private Janela parent;

    public Ranking(Janela janela) throws IOException {
        initComponents();
        this.um = new ImageIcon(ImageIO.read(new File("imagens/primeiro.png")).getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        this.dois = new ImageIcon(ImageIO.read(new File("imagens/segundo.png")).getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        this.tres = new ImageIcon(ImageIO.read(new File("imagens/terceiro.png")).getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        this.quatro = new ImageIcon(ImageIO.read(new File("imagens/quarto.png")).getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        this.cinco = new ImageIcon(ImageIO.read(new File("imagens/quinto.png")).getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        this.seis = new ImageIcon(ImageIO.read(new File("imagens/sexto.png")).getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        this.sete = new ImageIcon(ImageIO.read(new File("imagens/setimo.png")).getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        this.oito = new ImageIcon(ImageIO.read(new File("imagens/oitavo.png")).getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        this.nove = new ImageIcon(ImageIO.read(new File("imagens/nono.png")).getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        this.dez = new ImageIcon(ImageIO.read(new File("imagens/decimo.png")).getScaledInstance(30, 30, Image.SCALE_SMOOTH));

        lblPrimeiro.setIcon(um);
        lblSegundo.setIcon(dois);
        lblTerceiro.setIcon(tres);
        lblQuarto.setIcon(quatro);
        lblQuinto.setIcon(cinco);
        lblSexto.setIcon(seis);
        lblSetimo.setIcon(sete);
        lblOitavo.setIcon(oito);
        lblNono.setIcon(nove);
        lblDecimo.setIcon(dez);

        this.setParent(janela);

        carregarRanking();
    }

    public void setParent(Janela parent) {
        this.parent = parent;
    }

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
        btnVoltar = new javax.swing.JButton();

        lblRanking.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        lblRanking.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRanking.setText("Ranking");

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

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblNono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblOitavo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSetimo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSexto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblQuinto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblQuarto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTerceiro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPrimeiro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSegundo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDecimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNomeQuarto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNomeQuinto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNomeSexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNomeSetimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNomeOitavo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNomeNono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNomeDecimo, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                            .addComponent(lblNomeTerceiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNomeSegundo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNomePrimeiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnVoltar)))
                        .addGap(45, 45, 45))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(193, Short.MAX_VALUE)
                .addComponent(lblRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNomePrimeiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(7, 7, 7))
                    .addComponent(lblPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeSegundo)
                    .addComponent(lblSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeTerceiro)
                    .addComponent(lblTerceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeQuarto)
                    .addComponent(lblQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeQuinto)
                    .addComponent(lblQuinto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeSexto)
                    .addComponent(lblSexto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeSetimo)
                    .addComponent(lblSetimo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeOitavo)
                    .addComponent(lblOitavo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeNono)
                    .addComponent(lblNono, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeDecimo)
                            .addComponent(lblDecimo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnVoltar)
                        .addGap(29, 29, 29))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        parent.mostraMenu();
    }//GEN-LAST:event_btnVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
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

    private void carregarRanking() throws FileNotFoundException, IOException {
        BufferedReader arquivo = new BufferedReader(new FileReader("ranking.txt"));
        while (arquivo.ready()) {
            String linha = arquivo.readLine();
            String[] parts = linha.split("\t");
            String jogador = parts[0];
            int pontos = Integer.parseInt(parts[1]);
            pontuacoes.add(new Pontuacao(pontos, jogador));
        }
        arquivo.close();
        ordenar();
    }

    private void escreverRanking() throws FileNotFoundException, IOException {
        BufferedWriter arquivo = new BufferedWriter(new FileWriter("ranking.txt"));
        arquivo.flush();
        for (int i = 0; i < 10; i++) {
            String linha = pontuacoes.get(i).getNome() + "\t" + Integer.toString(pontuacoes.get(i).getPontos()) + "\n";
            arquivo.write(linha);
        }
        arquivo.close();
    }

    public void adicionarRecorde(String nome, int pontos) throws IOException {
        pontuacoes.add(new Pontuacao(pontos, nome));
        ordenar();
        escreverRanking();
    }

    private void ordenar() {
        Collections.sort(pontuacoes);
        Collections.reverse(pontuacoes);
    }

    public boolean entrouNoRanking(int pontos) {
        return pontos > pontuacoes.get(9).getPontos();
    }

    public void imprimirRecordes() {
        lblNomePrimeiro.setText(pontuacoes.get(0).toString());
        lblNomeSegundo.setText(pontuacoes.get(1).toString());
        lblNomeTerceiro.setText(pontuacoes.get(2).toString());
        lblNomeQuarto.setText(pontuacoes.get(3).toString());
        lblNomeQuinto.setText(pontuacoes.get(4).toString());
        lblNomeSexto.setText(pontuacoes.get(5).toString());
        lblNomeSetimo.setText(pontuacoes.get(6).toString());
        lblNomeOitavo.setText(pontuacoes.get(7).toString());
        lblNomeNono.setText(pontuacoes.get(8).toString());
        lblNomeDecimo.setText(pontuacoes.get(9).toString());
    }
}
