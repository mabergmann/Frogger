
import java.awt.image.BufferedImage;

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
abstract class Veiculo {
    private int posicaoVertical;
    private int posicaoHorizontal;
    private int direcao;
    private int altura;
    private BufferedImage imagem;

    public BufferedImage getImagem() {
        return imagem;
    }

    public void setImagem(BufferedImage imagem) {
        this.imagem = imagem;
    }
    
    public void move(){
        System.out.println("move");
    }
    
    public boolean estaColidindo(int x){
        System.out.println("retorna booleano");
        return false;
    }
}
