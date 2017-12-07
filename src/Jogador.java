
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
public class Jogador {
    private int vida;
    private int pontos;
    private ImageIcon imagem; 
    private int altura;
    private int largura;
    private int posicaoHorizontal;
    private int posicaoVertical;
    private JLabel label;

    
    public Jogador(JLabel label) throws IOException {
        BufferedImage imagem = ImageIO.read(new File("imagens/Sapo1.png"));
        this.setPosicao(300, 0);
        this.setTamanho(50, 50);
        this.setLabel(label);
        this.setImagem(imagem.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
    }
    
    public void setTamanho(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }
    
    public void setPosicao(int x, int y) {
        this.posicaoHorizontal = x;
        this.posicaoVertical = y;
    }
    
    public int getAltura() {
        return altura;
    }

    public int getLargura() {
        return largura;
    }

    public int getPosicaoHorizontal() {
        return posicaoHorizontal;
    }

    public int getPosicaoVertical() {
        return posicaoVertical;
    }

    private void setLabel(JLabel label) {
        this.label = label;
    }

   // public void setImagem(BufferedImage imagem) {
    public void setImagem(Image imagem) {
        ImageIcon imageIcon = new ImageIcon(imagem);
        this.imagem = imageIcon;
        label.setIcon(this.imagem);
    }
    
    public void moveEsquerda(){
<<<<<<< HEAD
        if(this.posicaoHorizontal != 0){
=======
>>>>>>> 6e2fd4bab19ccac30d497d34d03d51bd7af2b8c5
        this.posicaoHorizontal -= 20;
        atualizaPosicao();
        }
    }
    
    public void moveDireita(){
<<<<<<< HEAD
        if(this.posicaoHorizontal!=580){
=======
>>>>>>> 6e2fd4bab19ccac30d497d34d03d51bd7af2b8c5
        this.posicaoHorizontal += 20;
        atualizaPosicao();
        }
    }
    
    public void moveCima(){
<<<<<<< HEAD
        if(this.posicaoVertical!=5){
=======
>>>>>>> 6e2fd4bab19ccac30d497d34d03d51bd7af2b8c5
        this.posicaoVertical++;
        atualizaPosicao();
        }
    }
    
    public void moveBaixo(){
<<<<<<< HEAD
        if(this.posicaoVertical != 0){
            this.posicaoVertical--;
            atualizaPosicao();
        }
=======
        this.posicaoVertical--;
        atualizaPosicao();
>>>>>>> 6e2fd4bab19ccac30d497d34d03d51bd7af2b8c5
    }
    private void resetVida(){
        this.setVida(3);
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    
    private void reduzVida(){
        this.setVida(this.getVida()-1);
    }
    
    private int somaPontos(int pontos){
        System.out.println("soma pontos");
        return 0;
    }
    
    private boolean vivo(){
        System.out.println("retorna booleano");
        return true;
    }  
    
    public void atualizaPosicao(){
        label.setBounds(getPosicaoHorizontal(), 400-getPosicaoVertical()*75, getAltura(), getLargura());
    }
}
