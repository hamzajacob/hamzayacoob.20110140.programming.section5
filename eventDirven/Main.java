package eventDirven;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Welcome to Taradodna");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BufferedImage img = null;

        try {
            img = ImageIO.read(new File("Taradodna.png"));

        } catch (IOException a) {
            System.out.println("Cant Open image!");
        }

        ImageIcon imageIcon = new ImageIcon(img);
        JLabel label = new JLabel();
        label.setIcon(imageIcon);
        frame.getContentPane().add(label);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

} 
