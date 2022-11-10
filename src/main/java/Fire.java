import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

public class Fire extends Canvas implements Draw{
    double width;
    double height;
    double colCount;
    double rowCount;


    @Override
    public void paint(int row, int col) {
        getGraphicsContext2D().setFill(Color.RED);
        getGraphicsContext2D().fillRect(row*height/rowCount,col*width/colCount,height/rowCount,width/colCount);
    }
}
