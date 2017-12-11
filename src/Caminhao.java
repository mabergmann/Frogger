
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JLabel;

public class Caminhao extends Veiculo {

    public Caminhao(JLabel label, int faixa, int direcao, int velocidade) throws IOException {
        BufferedImage imagem;

        this.setDirecao(direcao);
        this.setVelocidade(velocidade);
        this.setTamanho(100, 50);

        if (this.getDirecao() == DIREITA) {
            imagem = ImageIO.read(new File("imagens/caminhao.png"));
            this.setPosicao(-50, faixa);
        } else {
            imagem = ImageIO.read(new File("imagens/caminhaoDE.png"));
            this.setPosicao(640, faixa);
        }

        this.setLabel(label);
        this.setImagem(imagem.getScaledInstance(100, 60, Image.SCALE_SMOOTH));
        label.setVisible(true);
        atualizaPosicao();
        this.move();

    }
}
