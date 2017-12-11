
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
public class Carro extends Veiculo {

    public Carro(JLabel label, int faixa, int direcao, int velocidade) throws IOException {
        BufferedImage imagem;

        this.setDirecao(direcao);
        this.setVelocidade(velocidade);
        this.setTamanho(50, 50);
        
        if (this.getDirecao() == DIREITA) {
            imagem = ImageIO.read(new File("imagens/carro.png"));
            this.setPosicao(-this.getLargura(), faixa);
        } else {
            imagem = ImageIO.read(new File("imagens/carroDE.png"));
            this.setPosicao(640, faixa);
        }
        
        this.setLabel(label);
        this.setImagem(imagem.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
        label.setVisible(true);
        atualizaPosicao();
        this.move();
    }

}
