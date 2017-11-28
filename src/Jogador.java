
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
   // BufferedImage imagem = ; 
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
    
    private void moveEsquerda(){
        System.out.println("move para a esquerda");
    }
    
    private void moveDireita(){
        System.out.println("move para a direita");
    }
    
    private void moveCima(){
        System.out.println("move para cima");
    }
    
    private void moveBaixo(){
        System.out.println("move para baixo");
    }
    
    private void resetVida(){
        System.out.println("reseta vida");
    }
    
    private void reduzVida(){
        System.out.println("reduz vida");
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
