package model;

import java.awt.Color;

public class StarType {
    private final Color startColor;
    private final StarSprite startSprite;
    
    public StarType(Color startColor, StarSprite startSprite) {
        this.startColor = startColor;
        this.startSprite = startSprite;
    }

    public Color getStartColor() {
        return startColor;
    }

    public StarSprite getStartSprite() {
        return startSprite;
    }
    
}
