package controller;

import model.SpaceModel;
import view.SpaceView;

public class SpaceController{
    private SpaceModel model;
    private SpaceView view;
    
    public SpaceController(SpaceModel model, SpaceView view) {
        this.model = model;
        this.view = view;
    }

    public SpaceModel getModel() {
        return model;
    }

    public SpaceView getView() {
        return view;
    }
    
}