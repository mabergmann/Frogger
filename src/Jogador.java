
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Jogador {

    private int vida;
    private ImageIcon imagem;
    private int altura;
    private int largura;
    private int posicaoHorizontal;
    private int posicaoVertical;
    private int pista;
    private int pontuacao;
    private long tempoInicio;
    private long tempoFim;
    private JLabel label;
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
        this.setPista(0);
        this.setLabel(label);
        this.setImagem(frente1);
        this.atualizaPosicao();
        this.resetVida();
        this.setTempoInicio(System.currentTimeMillis());
    }

    public long getTempoInicio() {
        return tempoInicio;
    }

    public JLabel getLabel() {
        return label;
    }

    public boolean isMovendo() {
        return movendo;
    }

    public void setMovendo(boolean movendo) {
        this.movendo = movendo;
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

    public void setTempoInicio(long tempoInicio) {
        this.tempoInicio = tempoInicio;
    }

    public int getPosicaoVertical() {
        return posicaoVertical;
    }

    public int getPista() {
        return this.pista;
    }

    private void setLabel(JLabel label) {
        this.label = label;
    }

    public void setPosicaoHorizontal(int posicaoHorizontal) {
        this.posicaoHorizontal = posicaoHorizontal;
    }

    public void setPosicaoVertical(int posicaoVertical) {
        this.posicaoVertical = posicaoVertical;
    }

    public void setImagem(Image imagem) {
        ImageIcon imageIcon = new ImageIcon(imagem);
        this.imagem = imageIcon;
        label.setIcon(this.imagem);
    }

    public long getTempoFim() {
        return tempoFim;
    }

    public void setTempoFim(long tempoFim) {
        this.tempoFim = tempoFim;
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

    public int getTempoDemorado() {
        return (int) (this.tempoFim - this.tempoInicio) / 1000;
    }

    public void reduzVida() {
        this.setVida(this.getVida() - 1);
    }

    public void somaPontos(int nivel) {
        this.setPontuacao(this.getPontuacao() + (150 - (10 * (this.getTempoDemorado() / 1000))) + (nivel * 10));
    }

    public boolean chegouAoFim() {

        if (this.getPosicaoVertical() == 25) {
            return true;
        }

        return false;
    }

    public boolean vivo() {
        return getVida() > 0;
    }

    public void atualizaPosicao() {
        label.setBounds(getPosicaoHorizontal(), getPosicaoVertical(), getLargura(), getAltura());
        label.setVisible(true);
    }

    public void matar() {
        this.reduzVida();
        if (getVida() == 0) {
            setTempoFim(System.currentTimeMillis());
        } else {
            this.setPosicao(300, 400);
            this.setPista(0);
            this.atualizaPosicao();
            this.setTempoInicio(System.currentTimeMillis());
        }
    }

    void setPista(int pista) {
        this.pista = pista;
    }

    public int getTempoEmSegundos() {
        long tempo = System.currentTimeMillis() - tempoInicio;
        return (int) (tempo / 1000);
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public void proximaFase(int nivel) {
        this.somaPontos(nivel);
        this.setTempoInicio(System.currentTimeMillis());
        this.setPosicao(300, 400);
        this.setVida(3);
        this.setPista(0);
        this.atualizaPosicao();
    }

    public void moveEsquerda() {
        if (this.getPosicaoHorizontal() > 40 && !this.isMovendo()) {
            this.setMovendo(true);

            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    setImagem(esquerda2);
                    setPosicaoVertical(getPosicaoVertical() - 10);
                    for (int i = 0; i < 40; i++) {
                        if (i == 20) {
                            setImagem(esquerda3);
                        }

                        setPosicaoHorizontal(getPosicaoHorizontal() - 1);
                        atualizaPosicao();
                        try {
                            Thread.sleep(5);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Jogador.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    setImagem(esquerda1);
                    setPosicaoVertical(getPosicaoVertical() + 10);
                    atualizaPosicao();
                    setMovendo(false);
                }
            });
            thread.start();
        }

    }

    public void moveDireita() {

        if (this.getPosicaoHorizontal() < 560 && !this.isMovendo()) {
            this.setMovendo(true);

            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    setImagem(direita2);
                    setPosicaoVertical(getPosicaoVertical() - 10);
                    for (int i = 0; i < 40; i++) {
                        if (i == 20) {
                            setImagem(direita3);
                        }
                        setPosicaoHorizontal(getPosicaoHorizontal() + 1);
                        atualizaPosicao();
                        try {
                            Thread.sleep(5);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Jogador.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    setImagem(direita1);
                    setPosicaoVertical(getPosicaoVertical() + 10);
                    atualizaPosicao();
                    setMovendo(false);
                }
            });
            thread.start();
        }
    }

    public void moveCima() {

        if (this.getPosicaoVertical() > 40 && !this.isMovendo()) {
            this.setMovendo(true);

            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    setImagem(frente2);
                    for (int i = 0; i < 75; i++) {
                        setPosicaoVertical(getPosicaoVertical() - 1);
                        atualizaPosicao();
                        try {
                            Thread.sleep(5);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Jogador.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    setPista(getPista() + 1);
                    setImagem(frente1);
                    setMovendo(false);
                }
            });
            thread.start();
        }
    }

    public void moveBaixo() {

        if (this.getPosicaoVertical() < 360 && !this.isMovendo()) {
            this.movendo = true;

            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    setImagem(baixo2);
                    for (int i = 0; i < 75; i++) {
                        setPosicaoVertical(getPosicaoVertical() + 1);
                        atualizaPosicao();
                        try {
                            Thread.sleep(5);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Jogador.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    setPista(getPista() + 1);
                    setImagem(baixo1);
                    setMovendo(false);
                }
            });
            thread.start();
        }
    }

}
