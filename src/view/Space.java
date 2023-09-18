package view;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

import model.Star;

public class Space extends JFrame{

    private static final int starDimension = 300;

    public Space(ArrayList<Star> space, int xDimension, int yDimension) {
        setTitle("Star Shape Example");
        setSize(xDimension / 3, yDimension / 3);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        panel.setPreferredSize(new Dimension(xDimension, yDimension));
        panel.setBackground(Color.BLACK);

        for (Star star : space){
            star.setBounds(star.getX(), star.getY(), starDimension, starDimension);
            panel.add(star);
        }

        // Star star1 = new Star(StarTypeFactory.getType(Color.WHITE, 0), 0, 0);
        // star1.setBounds(star1.getX(), star1.getY(), starDimension, starDimension);
        // panel.add(star1);

        // Star star2 = new Star(StarTypeFactory.getType(Color.YELLOW, 1), 1620, 620);
        // star2.setBounds(star2.getX(), star2.getY(), starDimension, starDimension);
        // panel.add(star2);

        // Star star3 = new Star(StarTypeFactory.getType(Color.RED, 2), 301, 401);
        // star3.setBounds(star3.getX(), star3.getY(), starDimension, starDimension);
        // panel.add(star3);

        JScrollPane scrollPane = new JScrollPane(panel);

        add(scrollPane);
    }

    
}