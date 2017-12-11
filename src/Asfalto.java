
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JLabel;

public class Asfalto extends Pista {

    private int velocidade;
    private int faixa;
    private int direcao = DIREITA;
    private ArrayList<Veiculo> veiculos = new ArrayList();

    public final static int DIREITA = Veiculo.DIREITA;
    public final static int ESQUERDA = Veiculo.ESQUERDA;

    public Asfalto(int faixa, int direcao, int velocidade) {
        this.setFaixa(faixa);
        this.setDirecao(direcao);
        this.setVelocidade(velocidade);
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getFaixa() {
        return faixa;
    }

    public int getDirecao() {
        return direcao;
    }

    public void inserirVeiculo(JLabel label) throws IOException {

        Random random = new Random();

        int tipo = (random.nextInt(3));

        Veiculo veiculo;

        switch (tipo) {
            case 0:
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
    
    public boolean temVeiculoNaPista(){
        if(veiculos.size()>0)
            return true;
        return false;
    }
    
    public Veiculo EscolheUmVeiculo(){
        Random random = new Random();
        
        int i = random.nextInt(veiculos.size());
        Veiculo veiculo = veiculos.get(i);
        
        return veiculo;
    }
    
    public void removeVeiculo(Veiculo veiculo){
        veiculos.remove(veiculo);
    }
    
    public void insereEsseVeiculo(Veiculo veiculo){
        veiculo.setVelocidade(velocidade);
        veiculos.add(veiculo);
    }

    public void setDirecao(int direcao) {
        if (direcao == DIREITA || direcao == ESQUERDA) {
            this.direcao = direcao;
        }
    }

    public void setFaixa(int faixa) {
        this.faixa = faixa;
    }

    private void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void excluiVeiculosAntigos() {
        int i = 0;
        while (i < veiculos.size()) {
            Veiculo veiculo = veiculos.get(i);
            if (veiculo.foraDosLimites()) {
                veiculo.destruir();
                veiculos.remove(i);
            } else {
                i++;
            }
        }
    }

    @Override
    public boolean estaColidindo(int posicaoHorizontal, int largura) {

        for (Veiculo veiculo : veiculos) {
            if (veiculo.estaColidindo(posicaoHorizontal, largura)) {
                return true;
            }
        }
        return false;
    }

    boolean podeAdicionarVeiculo() {
        if (this.getDirecao() == DIREITA && estaColidindo(-100, 200)) {
            return false;
        } else if (this.getDirecao() == ESQUERDA && estaColidindo(540, 200)) {
            return false;
        }
        return true;
        
    }
    
    public void aumentarVelocidade(){
        velocidade*=1.3;
        for(Veiculo veiculo : veiculos){
            veiculo.setVelocidade(velocidade);
        }
    }
}
