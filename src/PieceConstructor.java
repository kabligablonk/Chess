import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class PieceConstructor {
    int pieceColumn, pieceRow, pieceDimension;
    BufferedImage pieceImage;

    public PieceConstructor(BufferedImage image, int column, int row, int dimension) {
        this.pieceImage = image;
        this.pieceColumn = column;
        this.pieceRow = row;
        this.pieceDimension = dimension;

    }
}

class Piece {
    PieceConstructor placedPiece = new PieceConstructor(ImageIO.read(new File("pawn.png")),0,0,15);
}