
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
abstract class Pista {
    private BufferedImage background;
    private int altura;
    private int largura;
    private int posicaoVertical;
    private int posicaoHorizontal;
    
    private boolean estaColidindo(int x){
        System.out.println("retorna booleano");
        return false;
    }  
    
    public BufferedImage getBackground() {
        return background;
    }

    public void setBackground(BufferedImage background) {
        this.background = background;
    }
}
