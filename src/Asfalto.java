
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

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
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
                veiculo = new Carro(label, this.getFaixa(), this.getDirecao(), this.getVelocidade());
                break;
            case 1:
                veiculo = new Moto(label, this.getFaixa(), this.getDirecao(), this.getVelocidade());
                break;
            default:
                veiculo = new Caminhao(label, this.getFaixa(), this.getDirecao(), this.getVelocidade());
                break;
        }

        this.getVeiculos().add(veiculo);
        veiculo.setDirecao(this.getDirecao());
    }

    public boolean temVeiculoNaPista() {
        return this.getVeiculos().size() > 0;
    }

    public Veiculo EscolheUmVeiculo() {
        Random random = new Random();

        int i = random.nextInt(this.getVeiculos().size());
        Veiculo veiculo = this.getVeiculos().get(i);

        return veiculo;
    }

    public void removeVeiculo(Veiculo veiculo) {
        this.getVeiculos().remove(veiculo);
    }

    public void insereEsseVeiculo(Veiculo veiculo) {
        veiculo.setVelocidade(this.getVelocidade());
        this.getVeiculos().add(veiculo);
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
        while (i < getVeiculos().size()) {
            Veiculo veiculo = getVeiculos().get(i);
            if (veiculo.foraDosLimites()) {
                veiculo.destruir();
                removerVeiculo(i);
            } else {
                i++;
            }
        }
    }

    private void removerVeiculo(int i) {
        getVeiculos().remove(i);
    }

    @Override
    public boolean estaColidindo(int posicaoHorizontal, int largura) {

        for (Veiculo veiculo : this.getVeiculos()) {
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

    public void aumentarVelocidade() {
        this.setVelocidade((int) (this.getVelocidade() * 1.3));
        for (Veiculo veiculo : this.getVeiculos()) {
            veiculo.setVelocidade(this.getVelocidade());
        }
    }
}
