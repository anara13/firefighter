import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

import java.util.List;

public class FireFighter extends Canvas implements Draw{

    Position position;

    @Override
    public void paint(int row, int col, double width, double height, double colCount, double rowCount) {
        getGraphicsContext2D().setFill(Color.BLUE);
        getGraphicsContext2D().fillOval(row*height/rowCount,col*width/colCount,height/rowCount,width/colCount);

    }

    /*private Model.Position activateFirefighter(Model.Position position) {
        Model.Position randomPosition = Model.aStepTowardFire(position);
        List<Model.Position> nextFires = next(randomPosition).stream().filter(fires::contains).toList();
        extinguish(randomPosition);
        for (Model.Position fire : nextFires)
            extinguish(fire);
        return randomPosition;
    }*/

}
