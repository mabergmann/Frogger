
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JLabel;

public class Moto extends Veiculo {

    public Moto(JLabel label, int faixa, int direcao, int velocidade) throws IOException {
        BufferedImage imagem;

        this.setDirecao(direcao);

        this.setVelocidade(velocidade);
        this.setTamanho(30, 50);

        if (this.getDirecao() == DIREITA) {
            imagem = ImageIO.read(new File("imagens/moto.png"));
            this.setPosicao(-this.getLargura(), faixa);
        } else {
            imagem = ImageIO.read(new File("imagens/motoDE.png"));
            this.setPosicao(640, faixa);
        }

        this.setLabel(label);
        this.setImagem(imagem.getScaledInstance(30, 45, Image.SCALE_SMOOTH));
        label.setVisible(true);
        atualizaPosicao();
        this.move();
    }
}
