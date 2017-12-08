
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
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
    private int direcao; // Direcao = 1 para testar. (Sentido esquerda -> direita)
    private int largura;
    private int altura;
    private ImageIcon imagem;
    private JLabel label;

    public void setPosicao(int x, int y) {
        this.posicaoHorizontal = x;
        this.posicaoVertical = y;
    }

    public void setDirecao(int direcao) {
        this.direcao = direcao;
    }

    public int getDirecao() {
        return direcao;
    }

    public void move() {
        if (this.foraDosLimites()) {

            Random random2 = new Random();
            int faixa = 1 + random2.nextInt(4);

            if (faixa == 3 || faixa == 4) {
                this.setDirecao(-1);
            } else {
                this.setDirecao(1);
            }

            if (this.getDirecao() == 1) {
                this.setPosicao(0, faixa);
            } else {
                this.setPosicao(580, faixa);
            }

        } else // Esse trecho movimenta os veiculos, caso esteja na pista 2 ou 3, o movimento é maior.
        if ((this.getPosicaoVertical() == 2 || this.getPosicaoVertical() == 3)) {
            this.setPosicao(this.posicaoHorizontal + (this.direcao * 30), this.posicaoVertical);
        } else {
            this.setPosicao(this.posicaoHorizontal + (this.direcao * 20), this.posicaoVertical);
        }

        atualizaPosicao();
    }

    public boolean foraDosLimites() {
        if (this.posicaoHorizontal > 580 || this.posicaoHorizontal < 0) {
            return true;
        }
        return false;
    }

    public boolean estaColidindo(int x) {
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
