
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
        BufferedImage imagem = ImageIO.read(new File("imagens/moto.png"));
        this.setPosicao(1, 3);
        this.setTamanho(50, 45);
        this.setLabel(label);
        this.setImagem(imagem.getScaledInstance(30, 45, Image.SCALE_SMOOTH));
        label.setVisible(true);
        atualizaPosicao();
    }
}
