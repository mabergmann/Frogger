
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
    //private ImageIcon imagem;
    private final ImageIcon[] imagem; 
    private int altura;
    private int largura;
    private int x;
    private int y;
    private int spriteAtual;

    public int getSpriteAtual() {
        return spriteAtual;
    }

    public void setSpriteAtual(int spriteAtual) {
        this.spriteAtual = spriteAtual;
    }
    private final JLabel label;

    public JLabel getLabel() {
        return label;
    }

    public Jogador() {
        this.label = new JLabel();
        this.imagem = new ImageIcon[10];
    }

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
        return 250-y*50;
    }

    public void setLabel(ImageIcon imagem) {
        //this.label = label;
        label.setIcon(imagem);
    }

   // public void setImagem(BufferedImage imagem) {
    public void setImagem(Image imagem, int indice) {
        ImageIcon imageIcon = new ImageIcon(imagem);
        this.imagem[indice] = imageIcon;
        //label.setIcon(this.imagem[indice]);
    }

    public ImageIcon getImagem(int indice) {
        return imagem[indice];
    }
    
    public void moveEsquerda(){
        this.x -= 10;
        atualizaPosicao();
    }
    
    public void moveDireita(){
        this.x += 10;
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
