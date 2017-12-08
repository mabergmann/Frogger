
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
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
        Random random1 = new Random();
        int posHor = random1.nextInt(500);
        
        Random random2 = new Random();
        int faixa = 1+random2.nextInt(3);
        
        this.setPosicao(posHor, faixa);
        this.setTamanho(50, 50);
        this.setLabel(label);
        this.setImagem(imagem.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
        label.setVisible(true);
        atualizaPosicao();
    }

}
