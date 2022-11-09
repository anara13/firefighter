import javafx.scene.paint.Color;

public class FireFighter implements Draw{

    @Override
    public void paint(int row, int col) {
        getGraphicsContext2D().setFill(Color.BLUE);
        getGraphicsContext2D().fillOval(row*height/rowCount,col*width/colCount,height/rowCount,width/colCount);
    }
}
