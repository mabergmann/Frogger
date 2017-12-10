
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
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
    int pista;
    JLabel label;

    public void setLabel(JLabel label) {
        this.label = label;
    }
    
    public void setPista(int pista){
        this.pista = pista;
    }
    
    abstract public boolean estaColidindo(int posicaoHorizontalJogador, int largura);
    
    public ImageIcon getBackground() {
        return background;
    }

    public void setBackground(BufferedImage background) {
        ImageIcon backgroundIcon = new ImageIcon(background);
        this.background = backgroundIcon;
        label.setIcon(this.background);
    }
    
    abstract public Veiculo veiculoTrocaPista();

    abstract boolean veiculoTrocou(Veiculo veiculoTrocaPista);

    abstract void insereEsseVeiculo(Veiculo veiculo);
}
