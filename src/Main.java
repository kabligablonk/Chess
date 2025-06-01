import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("Chess");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(600,600);
        window.setResizable(false);
        window.setLayout(new GridLayout(8, 8,1,1));

        Color light = new Color(255,255,255);
        Color dark = new Color(0,0,0);

        for (int i = 0; i < 64; i++) {
            int row = i / 8;
            int col = i % 8;

            JPanel panel = new JPanel();
            JLabel label = new JLabel(String.valueOf(col) + "," + String.valueOf(row));
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

class Pieces {
    private int pieceColumn, pieceRow, pieceDimension;
    private BufferedImage pieceImage;

    public piece(BufferedImage image, int column, int row, int dimension) {
        pieceImage = image;
        pieceColumn = column;
        pieceRow = row;
        pieceDimension = dimension;
    }
}

