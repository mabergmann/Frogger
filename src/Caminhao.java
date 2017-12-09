
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
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
    
 public Caminhao(JLabel label, int faixa, int direcao, int velocidade) throws IOException {
        BufferedImage imagem;
        
        this.setDirecao(direcao);

        if (this.getDirecao() == 1) {
            imagem  = ImageIO.read(new File("imagens/caminhao.png"));
            this.setPosicao(-50, faixa);
        } else {
            imagem = ImageIO.read(new File("imagens/caminhaoDE.png"));
            this.setPosicao(640, faixa);
        }
        this.setVelocidade(velocidade);
        this.setTamanho(100, 50);
        this.setLabel(label);
        this.setImagem(imagem.getScaledInstance(100, 60, Image.SCALE_SMOOTH));
        label.setVisible(true);
        atualizaPosicao();
        this.move();
     
    }
}
