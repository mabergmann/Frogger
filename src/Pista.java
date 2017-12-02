
import java.awt.Color;
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
abstract class Pista {
    private ImageIcon background;
    private int altura;
    private int largura;
    private int posicaoVertical;
    private int posicaoHorizontal;
    private JLabel label;

    public void setLabel(JLabel label) {
        this.label = label;
    }
    
    private boolean estaColidindo(int x){
        System.out.println("retorna booleano");
        return false;
    }  
    
    public ImageIcon getBackground() {
        return background;
    }

    public void setBackground(BufferedImage background) {
        ImageIcon backgroundIcon = new ImageIcon(background);
        this.background = backgroundIcon;
        label.setIcon(this.background);
    }
}
