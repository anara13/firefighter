package model;

import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;
import model.Draw;

import java.util.List;

public class Fire extends Position implements Draw {

    public Fire(int row, int col) {
        super(row, col);
    }

    @Override
    public void paint(int row, int col, double width, double height, double colCount, double rowCount) {
        getGraphicsContext2D().setFill(Color.RED);
        getGraphicsContext2D().fillRect(row*height/rowCount,col*width/colCount,height/rowCount,width/colCount);
    }

    /*private List<Position> activateFire(Position position) {
        return next(position);
    }*/


}
