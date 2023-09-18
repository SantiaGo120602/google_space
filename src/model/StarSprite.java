package model;

public class StarSprite {

    private final int[] X = new int[16];
    private final int[] Y = new int[16];

    public StarSprite(int id){

        if (id > 3 || id < 0){
            throw new IllegalArgumentException("Invalid input: " + id);
        }

        id += 14;

        int radius[] = {118,40,90,40};
        
        for (double current=0.0; current<16; current++) {
            int i = (int) current;
            double x = Math.cos(current*((2*Math.PI)/id))*radius[i % 4];
            double y = Math.sin(current*((2*Math.PI)/id))*radius[i % 4];
            X[i] = (int) x + 150;
            Y[i] = (int) y + 150;
        }
    }

    public int[] getX() {
        return X;
    }

    public int[] getY() {
        return Y;
    }
    
    
}
