
import java.awt.Image;
import java.awt.image.BufferedImage;
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
public class Jogador {
    private int vida;
    private int pontos;
    private ImageIcon imagem; 
    private int altura;
    private int largura;
    private int x;
    private int y;
    private JLabel label;

    public void setTamanho(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }
    
    public void setPosicao(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getAltura() {
        return altura;
    }

    public int getLargura() {
        return largura;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return 400-y*75;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

   // public void setImagem(BufferedImage imagem) {
    public void setImagem(Image imagem) {
        ImageIcon imageIcon = new ImageIcon(imagem);
        this.imagem = imageIcon;
        label.setIcon(this.imagem);
    }
    
    public void moveEsquerda(){
        this.x -= 20;
        atualizaPosicao();
    }
    
    public void moveDireita(){
        this.x += 20;
        atualizaPosicao();
    }
    
    public void moveCima(){
        this.y++;
        atualizaPosicao();
    }
    
    public void moveBaixo(){
        this.y--;
        atualizaPosicao();
    }
    
    private void resetVida(){
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
    
    private void reduzVida(){
        this.setVida(this.getVida()-1);
    }
    
    private int somaPontos(int pontos){
        System.out.println("soma pontos");
        return 0;
    }
    
    private boolean vivo(){
        System.out.println("retorna booleano");
        return true;
    }  
    
    public void atualizaPosicao(){
        label.setBounds(getX(), getY(), getAltura(), getLargura());
    }
}
