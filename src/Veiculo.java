
import java.awt.Container;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

abstract class Veiculo {

    private int posicaoVertical;
    private int posicaoHorizontal;
    private int faixa;
    private int direcao; // Direcao = 1 para testar. (Sentido esquerda -> direita)
    private int largura;
    private int altura;
    private int velocidade=1;
    private ImageIcon imagem;
    private JLabel label;
    
    public final static int DIREITA = 1;
    public final static int ESQUERDA = -1;

    public void setPosicao(int x, int faixa) {
        this.posicaoHorizontal = x;
        this.posicaoVertical = 400 - faixa * 75;
        this.faixa = faixa;
    }
    
    public int getFaixa(){
        return this.faixa;
    }
    
    public void setDirecao(int direcao) {
        this.direcao = direcao;
    }
    
    public void setVelocidade(int velocidade){
        if(velocidade>0){
            this.velocidade=velocidade;
        }
    }
    
    public int getVelocidade(){
        return this.velocidade;
    }

    public int getDirecao() {
        return direcao;
    }

    protected void move() {
        if (!this.foraDosLimites()){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (!foraDosLimites()) {
                        setPosicaoHorizontal(getPosicaoHorizontal() + getDirecao());
                        atualizaPosicao();
                        try {
                            Thread.sleep(800/getVelocidade());
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Veiculo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    atualizaPosicao();
                }
            });
            thread.start();
        }
    }

    public boolean foraDosLimites() {
        if(this.direcao == DIREITA && getPosicaoHorizontal() >= 640)
            return true;
        if(this.direcao == ESQUERDA && getPosicaoHorizontal()<=-getLargura())
            return true;
        return false;
    }

    public boolean estaColidindo(int x, int largura) {
        if(this.getPosicaoHorizontal()<=x && x<=this.getPosicaoHorizontal()+this.getLargura())
            return true;
        if(x<=this.getPosicaoHorizontal() && this.getPosicaoHorizontal()<=x+largura)
            return true;
        return false;
    }

    public int getPosicaoVertical() {
        return posicaoVertical;
    }

    public int getPosicaoHorizontal() {
        return posicaoHorizontal;
    }

    public void setImagem(Image imagem) {
        ImageIcon imageIcon = new ImageIcon(imagem);
        this.imagem = imageIcon;
        label.setIcon(this.imagem);
    }

    public void setTamanho(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public int getLargura() {
        return largura;
    }

    public int getAltura() {
        return altura;
    }

    public void atualizaPosicao() {
        label.setBounds(getPosicaoHorizontal(), getPosicaoVertical(), getLargura(), getAltura());
    }

    private void setPosicaoVertical(int posicaoVertical) {
        this.posicaoVertical = posicaoVertical;
    }

    private void setPosicaoHorizontal(int posicaoHorizontal) {
        this.posicaoHorizontal = posicaoHorizontal;
    }
    
    public void destruir(){
        Container parent = this.label.getParent();
        this.label.setVisible(false);
        parent.remove(this.label);
        parent.validate();
        parent.repaint();
    }

    void iniciaTrocaDePista(int faixa) {
        Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i=0; i<75;i++){
                        if(getFaixa()<faixa){
                            setPosicaoVertical(getPosicaoVertical()-1);
                        }else{
                            setPosicaoVertical(getPosicaoVertical()+1);
                        }
                        try {
                            Thread.sleep(5);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Veiculo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    setPosicao(getPosicaoHorizontal(), faixa);
                    atualizaPosicao();
                }
            });
            thread.start();
    }
}
