import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("Chess");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(600,600);
        window.setResizable(false);
        window.setLayout(new GridLayout(8, 8,1,1));

        Color light = new Color(222, 206, 214);
        Color dark = new Color(162, 79, 16);

        for (int i = 0; i < 64; i++) {
            int row = i / 8;
            int col = i % 8;

            JPanel panel = new JPanel();
            JLabel label = new JLabel(col + "," + row);
            if ((col + row) % 2 == 0) {
                panel.setBackground(light);
            } else {
                panel.setBackground(dark);
            }
            panel.add(label);
            window.add(panel);
        }
        window.setVisible(true);
    }
}

class Loader {
    BufferedImage img;
    {
        try {
            img = ImageIO.read(new File("pawn.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected void draw(Graphics image) {
        super.paintComponent();
        image.drawImage(image, 50, 50, null);
    }
}
