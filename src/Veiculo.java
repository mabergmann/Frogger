
import java.awt.Container;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

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
abstract class Veiculo {

    private int posicaoVertical;
    private int posicaoHorizontal;
    private int faixa;
    private int direcao; // Direcao = 1 para testar. (Sentido esquerda -> direita)
    private int largura;
    private int altura;
    private int velocidade=1;
    private ImageIcon imagem;
    private JLabel label;
    
    public final static int DIREITA = 1;
    public final static int ESQUERDA = -1;

    public void setPosicao(int x, int faixa) {
        this.posicaoHorizontal = x;
        this.posicaoVertical = 400 - faixa * 75;
        this.faixa = faixa;
    }

    
    private void setFaixa(int faixa){
        this.faixa = faixa;
    }
    
    public int getFaixa(){
        return this.faixa;
    }
    
    public void setDirecao(int direcao) {
        this.direcao = direcao;
    }
    
    public void setVelocidade(int velocidade){
        if(velocidade>0){
            this.velocidade=velocidade;
        }
    }

    public int getDirecao() {
        return direcao;
    }

    protected void move() {
        if (this.foraDosLimites()) {

        }else{
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (!foraDosLimites()) {
                        posicaoHorizontal += getDirecao();
                        atualizaPosicao();
                        try {
                            Thread.sleep(20/velocidade);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Veiculo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    atualizaPosicao();
                    setFaixa(faixa);
                }
            });
            thread.start();
        }
    }

    public boolean foraDosLimites() {
        if(this.direcao == DIREITA && getPosicaoHorizontal() >= 640)
            return true;
        if(this.direcao == ESQUERDA && getPosicaoHorizontal()<=-getLargura())
            return true;
        return false;
    }

    public boolean estaColidindo(int x, int largura) {
        if(this.getPosicaoHorizontal()<=x && x<=this.getPosicaoHorizontal()+this.getLargura())
            return true;
        if(x<=this.getPosicaoHorizontal() && this.getPosicaoHorizontal()<=x+largura)
            return true;
        return false;
    }

    public int getPosicaoVertical() {
        return posicaoVertical;
    }

    public int getPosicaoHorizontal() {
        return posicaoHorizontal;
    }

    public void setImagem(Image imagem) {
        ImageIcon imageIcon = new ImageIcon(imagem);
        this.imagem = imageIcon;
        label.setIcon(this.imagem);
    }

    public void setTamanho(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public int getLargura() {
        return largura;
    }

    public int getAltura() {
        return altura;
    }

    public void atualizaPosicao() {
        label.setBounds(getPosicaoHorizontal(), getPosicaoVertical(), getLargura(), getAltura());
    }
    
    public void destruir(){
        Container parent = this.label.getParent();
        this.label.setVisible(false);
        parent.remove(this.label);
        parent.validate();
        parent.repaint();
    }

    void iniciaTrocaDePista(int faixa) {
        Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i=0; i<75;i++){
                        if(getFaixa()<faixa){
                            posicaoVertical--;
                        }else{
                            posicaoVertical++;
                        }
                        try {
                            Thread.sleep(5);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Veiculo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    setPosicao(getPosicaoHorizontal(), faixa);
                    atualizaPosicao();
                }
            });
            thread.start();
    }
}
