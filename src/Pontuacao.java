public class Pontuacao implements Comparable<Pontuacao> {
    private int pontos;
    private String nome;

    public Pontuacao(int pontos, String nome) {
        this.pontos = pontos;
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public String getNome() {
        return nome;
    }
    
    @Override
    public int compareTo(Pontuacao outraPontuacao) {
        if (this.pontos < outraPontuacao.pontos) {
            return -1;
        }
        if (this.pontos > outraPontuacao.pontos) {
            return 1;
        }
        return 0;
    }
    
    @Override
    public String toString(){
        return nome + " - " + Integer.toString(pontos);
    }
}
