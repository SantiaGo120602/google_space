package view;

import java.awt.Color;

import javax.swing.*;

import model.Star;
import model.StarTypeFactory;

public class Space extends JFrame{
    public Space() {
        setTitle("Star Shape Example");
        setSize(2000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);

        Star star1 = new Star(StarTypeFactory.getType(Color.WHITE, 0), 0, 0);
        panel.add(star1);

        Star star2 = new Star(StarTypeFactory.getType(Color.YELLOW, 1), 1620, 620);
        panel.add(star2);

        Star star3 = new Star(StarTypeFactory.getType(Color.RED, 2), 301, 401);
        panel.add(star3);

        add(panel);
    }

    
}