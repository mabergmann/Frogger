
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
public class Moto extends Veiculo{
    
    public Moto(JLabel label) throws IOException {
        BufferedImage imagem;
         
        Random random2 = new Random();
        int faixa = 1+random2.nextInt(4);
   
        if(faixa==3 || faixa ==4){
            this.setDirecao(-1);
        }else{
            this.setDirecao(1);
        }
        
        if(this.getDirecao()==1) {
            imagem  = ImageIO.read(new File("imagens/moto.png"));
            this.setPosicao(0, faixa);
        }else{
            imagem  = ImageIO.read(new File("imagens/motoDE.png"));
            this.setPosicao(580, faixa);
        }
        
        this.setTamanho(50, 45);
        this.setLabel(label);
        this.setImagem(imagem.getScaledInstance(30, 45, Image.SCALE_SMOOTH));
        label.setVisible(true);
        atualizaPosicao();
    }
}
