package model;

import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;


public class FireFighter extends Position implements Draw {

    public FireFighter(int row, int col) {
        super(row, col);
    }

    @Override
    public void paint(int row, int col, double width, double height, double colCount, double rowCount) {

        getGraphicsContext2D().setFill(Color.BLUE);
        getGraphicsContext2D().fillOval(row*height/rowCount,col*width/colCount,height/rowCount,width/colCount);

    }


}
