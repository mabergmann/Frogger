
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package frogger;
/**
 *
 * @author Júlia
 */
public class Jogador {

    private int vida;
    private int pontos;
    private ImageIcon imagem;
    private int altura;
    private int largura;
    private int posicaoHorizontal;
    private int posicaoVertical;
    private JLabel label;
    private boolean vivo;
    private boolean movendo = false;
    private final Image frente1;
    private final Image frente2;
    private final Image baixo1;
    private final Image baixo2;
    private final Image esquerda1;
    private final Image esquerda2;
    private final Image esquerda3;
    private final Image direita1;
    private final Image direita2;
    private final Image direita3;

    public Jogador(JLabel label) throws IOException {
        this.frente1 = ImageIO.read(new File("imagens/sapoFrente1.png")).getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        this.frente2 = ImageIO.read(new File("imagens/sapoFrente2.png")).getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        this.baixo1 = ImageIO.read(new File("imagens/sapoTras1.png")).getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        this.baixo2 = ImageIO.read(new File("imagens/sapoTras2.png")).getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        this.esquerda1 = ImageIO.read(new File("imagens/sapoEsquerda1.png")).getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        this.esquerda2 = ImageIO.read(new File("imagens/sapoEsquerda2.png")).getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        this.esquerda3 = ImageIO.read(new File("imagens/sapoEsquerda3.png")).getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        this.direita1 = ImageIO.read(new File("imagens/sapoDireita1.png")).getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        this.direita2 = ImageIO.read(new File("imagens/sapoDireita2.png")).getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        this.direita3 = ImageIO.read(new File("imagens/sapoDireita3.png")).getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        
        this.setPosicao(300, 400);
        this.setTamanho(50, 50);
        this.setLabel(label);
        this.setImagem(frente1);
        this.vivo = true;
    }

    public void setTamanho(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public void setPosicao(int x, int y) {
        this.posicaoHorizontal = x;
        this.posicaoVertical = y;
    }

    public int getAltura() {
        return altura;
    }

    public int getLargura() {
        return largura;
    }

    public int getPosicaoHorizontal() {
        return posicaoHorizontal;
    }

    public int getPosicaoVertical() {
        return posicaoVertical;
    }

    private void setLabel(JLabel label) {
        this.label = label;
    }

    // public void setImagem(BufferedImage imagem) {
    public void setImagem(Image imagem) {
        ImageIcon imageIcon = new ImageIcon(imagem);
        this.imagem = imageIcon;
        label.setIcon(this.imagem);
    }

    public void moveEsquerda() {
        if (this.posicaoHorizontal > 40 && !this.movendo) {
            this.movendo = true;

            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    setImagem(esquerda2);
                    for (int i = 0; i < 40; i++) {
                        if (i == 20) {
                            setImagem(esquerda3);
                        }

                        posicaoHorizontal -= 1;
                        atualizaPosicao();
                        try {
                            Thread.sleep(5);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Jogador.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    setImagem(esquerda1);
                    movendo = false;
                }
            });
            thread.start();
        }

    }

    public void moveDireita() {

        if (this.posicaoHorizontal < 560 && !this.movendo) {
            this.movendo = true;

            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    setImagem(direita2);
                    for (int i = 0; i < 40; i++) {
                        if (i == 20) {
                            setImagem(direita3);
                        }
                        posicaoHorizontal += 1;
                        atualizaPosicao();
                        try {
                            Thread.sleep(5);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Jogador.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    setImagem(direita1);
                    movendo = false;
                }
            });
            thread.start();
        }
    }

    public void moveCima() {

        if (this.posicaoVertical > 40 && !this.movendo) {
            this.movendo = true;

            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    setImagem(frente2);
                    for (int i = 0; i < 75; i++) {
                        posicaoVertical -= 1;
                        atualizaPosicao();
                        try {
                            Thread.sleep(5);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Jogador.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    setImagem(frente1);
                    movendo = false;
                }
            });
            thread.start();
        }
    }

    public void moveBaixo() {

        if (this.posicaoVertical < 360 && !this.movendo) {
            this.movendo = true;

            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    setImagem(baixo2);
                    for (int i = 0; i < 75; i++) {
                        posicaoVertical++;
                        atualizaPosicao();
                        try {
                            Thread.sleep(5);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Jogador.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    setImagem(baixo1);
                    movendo = false;
                }
            });
            thread.start();
        }
    }

    private void resetVida() {
        this.setVida(3);
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    private void reduzVida() {
        this.setVida(this.getVida() - 1);
    }

    private int somaPontos(int pontos) {
        System.out.println("soma pontos");
        return 0;
    }

    public boolean vivo() {
        return this.vivo;
    }

    public void atualizaPosicao() {
        label.setBounds(getPosicaoHorizontal(), getPosicaoVertical(), getAltura(), getLargura());
        label.setVisible(true);
    }
}
