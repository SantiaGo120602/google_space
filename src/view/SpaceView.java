package view;

import java.util.ArrayList;

import model.Star;

public class SpaceView{

    private Space space;

    public SpaceView(ArrayList<Star> space, int xDimension, int yDimension) {
        this.space = new Space(space, xDimension, yDimension);
    }

    public Space getSpace() {
        return space;
    }
    
    

}