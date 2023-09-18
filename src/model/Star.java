package model;

import javax.swing.*;
import java.awt.*;

public class Star extends JComponent{
    private final StarType starType;
    private final int X;
    private final int Y;

    public Star(StarType starType, int x, int y) {
        this.starType = starType;
        X = x;
        Y = y;
    }

    protected void paintComponent(Graphics g) {
    
        g.setColor(starType.getStartColor());

        StarSprite startSprite = starType.getStartSprite();
        g.fillPolygon(startSprite.getX(), startSprite.getY(), 16);

    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    

}
