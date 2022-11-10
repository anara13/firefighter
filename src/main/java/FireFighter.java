import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

public class FireFighter extends Canvas implements Draw{

    Position position;
    double width;
    double height;
    double colCount;
    double rowCount;

    public FireFighter(){

    }

    @Override
    public void paint(int row, int col) {
        getGraphicsContext2D().setFill(Color.BLUE);
        getGraphicsContext2D().fillOval(row*height/rowCount,col*width/colCount,height/rowCount,width/colCount);

    }
}
