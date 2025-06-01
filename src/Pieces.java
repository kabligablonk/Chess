import java.awt.image.BufferedImage;

public class Pieces {
    int pieceColumn, pieceRow, pieceDimension;
    BufferedImage pieceImage;

    public Pieces(BufferedImage image, int column, int row, int dimension) {
        this.pieceImage = image;
        this.pieceColumn = column;
        this.pieceRow = row;
        this.pieceDimension = dimension;
    }
}

