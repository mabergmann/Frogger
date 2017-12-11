
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

abstract class Pista {

    private ImageIcon background;
    int pista;
    JLabel label;

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public void setPista(int pista) {
        this.pista = pista;
    }

    abstract public boolean estaColidindo(int posicaoHorizontalJogador, int largura);

    public ImageIcon getBackground() {
        return background;
    }

    public void setBackground(ImageIcon background) {
        this.background = background;
    }

    public void setBackground(BufferedImage background) {
        ImageIcon backgroundIcon = new ImageIcon(background);
        this.setBackground(backgroundIcon);
        label.setIcon(this.getBackground());
    }
}
