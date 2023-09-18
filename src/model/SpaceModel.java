package model;

import java.util.ArrayList;
import java.awt.Color;
import java.util.Random;


public class SpaceModel {
    private ArrayList<Star> space = new ArrayList<>();
    private static Color[] colors = new Color[] {Color.YELLOW, Color.WHITE, Color.RED, Color.BLUE};
    private static Random random = new Random();
    
    public SpaceModel(int starAmount, int xDimension, int yDimension){
        for (int i = 0; i < starAmount; i++){
            int x = random.nextInt(xDimension);
            int y = random.nextInt(yDimension);
            int starSprite = random.nextInt(3);
            Color starColor = colors[random.nextInt(4)];
            space.add(new Star(StarTypeFactory.getType(starColor, starSprite), x, y));
        }
    }

    public ArrayList<Star> getSpace() {
        return space;
    }
    
}