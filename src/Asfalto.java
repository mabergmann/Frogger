
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
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
        
        Random random = new Random();
        
        int tipo = (random.nextInt(3));
        
        Veiculo veiculo;
        
        switch(tipo){
            case 0 :
                veiculo = new Carro(label, this.faixa, this.direcao, this.velocidade);
                break;
            case 1:
                veiculo = new Moto(label, this.faixa, this.direcao, this.velocidade);
                break;
            default:
                veiculo = new Caminhao(label, this.faixa, this.direcao, this.velocidade);
                break;
        }
        
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
            Veiculo veiculo = veiculos.get(i);
            if(veiculo.foraDosLimites()){
                veiculo.destruir();
                veiculos.remove(i);
            }else{
                i++;
            }
        }
    }
    
    @Override
    public boolean estaColidindo(int posicaoHorizontal, int largura) {

        for (Veiculo veiculo : veiculos) {
            if(veiculo.estaColidindo(posicaoHorizontal, largura))
                return true;
        }
        return false;
    }
}


