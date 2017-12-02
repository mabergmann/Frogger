
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

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
public class Jogo {
   
    private int tempo;
    private static Jogador jogador;
    private static Janela janela;

    private Pista[] pistas = new Pista[5]; // 2 Calçadas + 3 Asfaltos = 5 Pistas
    boolean podeIniciar = false; // Serve para verificar se já devemos começar o jogo, se torna true ao clicar no botão start.
    
    Jogo() throws IOException{

        pistas[4] = new Calcada();
        pistas[3] = new Asfalto();
        pistas[2] = new Asfalto();
        pistas[1] = new Asfalto();
        pistas[0] = new Calcada();
        jogador = new Jogador();
        janela = new Janela();
        
        janela.setSize(600, 400);
        
        jogador.setImagem(ImageIO.read(new File("imagens/jogador.png")));
        pistas[4].setBackground(ImageIO.read(new File("imagens/calcada.png")));
        pistas[3].setBackground(ImageIO.read(new File("imagens/asfalto.png")));
        pistas[2].setBackground(ImageIO.read(new File("imagens/asfalto.png")));
        pistas[1].setBackground(ImageIO.read(new File("imagens/asfalto.png")));
        pistas[0].setBackground(ImageIO.read(new File("imagens/calcada.png")));

        janela.setCalcada2(new ImageIcon(pistas[4].getBackground()));
        janela.setAsfalto3(new ImageIcon(pistas[3].getBackground()));
        janela.setAsfalto2(new ImageIcon(pistas[2].getBackground()));
        janela.setAsfalto1(new ImageIcon(pistas[1].getBackground()));
        janela.setCalcada1(new ImageIcon(pistas[0].getBackground()));        

        jogador.setPosicaoHorizontal(janela.getWidth()/2);
        jogador.setPosicaoVertical(janela.getHeight());
        janela.setPosixLblJogador(40);//janela.getWidth()/2
        janela.setPosiyLblJogador(90);//janela.getHeight()
        janela.setLblJogador(new ImageIcon(jogador.getImagem()));
        
        janela.setVisible(true);
        
        jogador.setVida(1);
    }

    void mostraMenu() {
        while (!podeIniciar) {
            System.out.println("Esperando o botão start ser apertado...");
        }
    }

    public boolean isPodeiniciar() {
        return podeIniciar;
    }

    public void setPodeiniciar(boolean podeiniciar) {
        this.podeIniciar = podeiniciar;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    void iniciaJogo() {        
        System.out.println("Iniciou o jogo.");
    }

    void mostraMenuPosJogo() {
        System.out.println("mostra menu");
    }
    
    public static void main(String args[]) throws IOException{
        Jogo jogo = new Jogo();
        //while(jogador.getVida() > 0){
          //  janela.atualizaJanela();
        //}

    }
}

