
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
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
public class Carro extends Veiculo {

    
    public Carro(JLabel label) throws IOException {
        BufferedImage imagem = ImageIO.read(new File("imagens/carro.png"));
        this.setPosicao(1, 1);
        this.setTamanho(50, 50);
        this.setLabel(label);
        this.setImagem(imagem.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
        label.setVisible(true);
        atualizaPosicao();
    }

}
