
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
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
public class Moto extends Veiculo{
    
    public Moto(JLabel label) throws IOException {
        BufferedImage imagem = ImageIO.read(new File("imagens/carro.png"));
        this.setPosicao(0, 0);
        this.setTamanho(50, 50);
        this.setLabel(label);
        this.setImagem(imagem.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
    
    }
}
