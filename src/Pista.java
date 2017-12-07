
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
    JLabel label;

    public void setLabel(JLabel label) {
        this.label = label;
    }
    
/* Comecei a estaColidindo mas não estou chamando ela corretamente na janela.
    
    private boolean estaColidindo(int posicaoHorizontalJogador, Veiculo[] veiculos) {

        for (Veiculo veiculo : veiculos) {
            // 50 usado no if abaixo, refere-se a largura do personagem.
            if ((veiculo.getPosicaoHorizontal() <= posicaoHorizontalJogador && veiculo.getPosicaoHorizontal() + veiculo.getLargura() >= posicaoHorizontalJogador) || (veiculo.getPosicaoHorizontal() <= posicaoHorizontalJogador + 50 && veiculo.getPosicaoHorizontal() + veiculo.getLargura() >= posicaoHorizontalJogador + 50)) {
               return true;
            }
        }
        return false;
    }
*/
    
    
    public ImageIcon getBackground() {
        return background;
    }

    public void setBackground(BufferedImage background) {
        ImageIcon backgroundIcon = new ImageIcon(background);
        this.background = backgroundIcon;
        label.setIcon(this.background);
    }
}
