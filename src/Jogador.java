
import java.awt.image.BufferedImage;

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
    private BufferedImage imagem; 
    private int altura;
    private int largura;
    private int posicaoVertical;
    private int posicaoHorizontal;

    public int getPosicaoVertical() {
        return posicaoVertical;
    }

    public void setPosicaoVertical(int posicaoVertical) {
        this.posicaoVertical = posicaoVertical;
    }

    public int getPosicaoHorizontal() {
        return posicaoHorizontal;
    }

    public void setPosicaoHorizontal(int posicaoHorizontal) {
        this.posicaoHorizontal = posicaoHorizontal;
    }
    
    public BufferedImage getImagem() {
        return imagem;
    }

    public void setImagem(BufferedImage imagem) {
        this.imagem = imagem;
    }
    
    public void moveEsquerda(){
        this.posicaoHorizontal = this.posicaoHorizontal - 10;
    }
    
    public void moveDireita(){
        this.posicaoHorizontal = this.posicaoHorizontal + 10;
    }
    
    public void moveCima(){
        this.posicaoVertical = this.posicaoVertical + 1;
    }
    
    public void moveBaixo(){
        this.posicaoVertical = this.posicaoVertical - 1;
    }
    
    private void resetVida(){
        this.setVida(0);
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
}
