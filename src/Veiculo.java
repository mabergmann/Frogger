
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
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
    private int direcao = 1; // Direcao = 1 para testar. (Sentido esquerda -> direita)
    private int largura;
    private int altura;
    private ImageIcon imagem;
    private JLabel label;

    
    
    public void setPosicao(int x, int y) {
        this.posicaoHorizontal = x;
        this.posicaoVertical = y;
    }
    
    public void move(){
        this.setPosicao(this.posicaoHorizontal+(this.direcao * 20), this.posicaoVertical);
        atualizaPosicao();
    }
    
    public boolean estaColidindo(int x){
        System.out.println("retorna booleano");
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
        label.setBounds(getPosicaoHorizontal(), 400 - getPosicaoVertical() * 75, getAltura(), getLargura());
    }
    
}
