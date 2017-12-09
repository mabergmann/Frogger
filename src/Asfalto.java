
import java.io.IOException;
import java.util.ArrayList;
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
public class Asfalto extends Pista{
    private int velocidade;
    private int faixa;
    private int direcao=DIREITA;
    private ArrayList<Veiculo> veiculos = new ArrayList();
    
    public final static int DIREITA = Veiculo.DIREITA;
    public final static int ESQUERDA = Veiculo.ESQUERDA;

    public Asfalto(int faixa, int direcao, int velocidade) {
        this.faixa = faixa;
        this.setDirecao(direcao);
        this.setVelocidade(velocidade);
    }
    
    public void inserirVeiculo(JLabel label) throws IOException{
        Veiculo veiculo = new Carro(label, this.faixa, this.direcao, this.velocidade);
        veiculos.add(veiculo);
        veiculo.setDirecao(this.direcao);
    }
    public void setDirecao(int direcao){
        if(direcao==DIREITA || direcao==ESQUERDA){
            this.direcao = direcao;
        }
    }

    private void setVelocidade(int velocidade) {
        this.velocidade=velocidade;
    }
    
    public void excluiVeiculosAntigos(){
        int i=0;
        while(i<veiculos.size()){
            if(veiculos.get(i).foraDosLimites()){
                veiculos.get(i).destruir();
                veiculos.remove(i);
            }else{
                i++;
            }
        }
    }
}


