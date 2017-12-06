
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

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
    private int direcao;
    private int altura;
    private ImageIcon imagem;   
    
    public void setPosicao(int x, int y) {
        this.posicaoHorizontal = x;
        this.posicaoVertical = y;
    }
    
    public void move(){
        System.out.println("move");
    }
    
    public boolean estaColidindo(int x){
        System.out.println("retorna booleano");
        return false;
    }
}
