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
