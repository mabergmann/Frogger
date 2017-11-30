
import java.util.HashSet;
import java.util.Set;
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
public class Jogo {

    JLabel lblJogador;
    JLabel calcada1;
    JLabel calcada2;
    JLabel asfalto1;
    JLabel asfalto2;
    JLabel asfalto3;

    public void setCalcada1(JLabel calcada1) {
        this.calcada1 = calcada1;
    }

    public void setCalcada2(JLabel calcada2) {
        this.calcada2 = calcada2;
    }

    public void setAsfalto1(JLabel asfalto1) {
        this.asfalto1 = asfalto1;
    }

    public void setAsfalto2(JLabel asfalto2) {
        this.asfalto2 = asfalto2;
    }

    public void setAsfalto3(JLabel asfalto3) {
        this.asfalto3 = asfalto3;
    }
     
    public void setLblJogador(JLabel lblJogador) {
        this.lblJogador = lblJogador;
    }
    private int tempo;
    private Jogador jogador;
    private Pista[] pistas = new Pista[5]; // 2 Calçadas + 3 Asfaltos = 5 Pistas
    boolean podeIniciar = false; // Serve para verificar se já devemos começar o jogo, se torna true ao clicar no botão start.

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
        
        
        // Código que limpa o texto dos label e carrega as imagens.
        
        calcada1.setText("");
        calcada1.setIcon(new ImageIcon("imagens/calcada.png"));
        calcada2.setText("");
        calcada2.setIcon(new ImageIcon("imagens/calcada.png"));
        asfalto1.setText("");
        asfalto1.setIcon(new ImageIcon("imagens/asfalto.png"));
        asfalto2.setText("");
        asfalto2.setIcon(new ImageIcon("imagens/asfalto.png"));
        asfalto3.setText("");
        asfalto3.setIcon(new ImageIcon("imagens/asfalto.png"));
        lblJogador.setText("");
        lblJogador.setIcon(new ImageIcon("imagens/jogador.png"));
        
        System.out.println("Iniciou o jogo.");
        
        
        //Tudo aqui pode ser substituido pelo construtor de Jogador.
        Jogador jogadorFrogger = new Jogador();
        jogadorFrogger.setPosicaoHorizontal(0);
        jogadorFrogger.setPosicaoVertical(0);

        // Criando as pistas e calçadas, também vamos utilizar o construtor das mesmas.
        Calcada primeiraCalcada = new Calcada();
        Asfalto primeiroAsfalto = new Asfalto();
        Asfalto segundoAsfalto = new Asfalto();
        Asfalto terceiroAsfalto = new Asfalto();
        Calcada segundaCalcada = new Calcada();

        pistas[4] = segundaCalcada;
        pistas[3] = terceiroAsfalto;
        pistas[2] = segundoAsfalto;
        pistas[1] = primeiroAsfalto;
        pistas[0] = primeiraCalcada;
        

    }

    void mostraMenuPosJogo() {
        System.out.println("mostra menu");
    }
}
