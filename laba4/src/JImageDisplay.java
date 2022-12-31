import javax.swing.JComponent;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;

public class JImageDisplay extends JComponent  {
    public BufferedImage b_image;
    public JImageDisplay(int width, int height){
        b_image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        super.setPreferredSize(new Dimension(width, height));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(b_image,0,0, b_image.getWidth(), b_image.getHeight(),null);
    }
    public void clearImage(){
        int[] black = new int[b_image.getHeight() * b_image.getWidth()];
        b_image.setRGB(0,0, getWidth(), getHeight(), black, 0,0);
    }

    public void drawPixel(int x, int y, int color) {
        b_image.setRGB(x, y, color);
    }
}
