package controller;

import model.SpaceModel;
import view.SpaceView;

public class SpaceController{
    private SpaceModel model;
    private SpaceView view;
    
    public SpaceController(int starAmount, int xDimension, int yDimension) {
        this.model = new SpaceModel(starAmount, xDimension, yDimension);
        this.view = new SpaceView(model.getSpace(), xDimension, yDimension);
    }

    public SpaceModel getModel() {
        return model;
    }

    public SpaceView getView() {
        return view;
    }
    
}