
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
public class Caminhao extends Veiculo{
    
    public Caminhao(JLabel label) throws IOException {
        BufferedImage imagem = ImageIO.read(new File("imagens/caminhao.png"));
        this.setPosicao(1, 2);
        this.setTamanho(50, 100);
        this.setLabel(label);
        this.setImagem(imagem.getScaledInstance(100, 60, Image.SCALE_SMOOTH));
        label.setVisible(true);
        atualizaPosicao();
    }
}
