package view;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

import model.Star;

public class Space extends JFrame{

    private static final int starDimension = 300;

    public Space(ArrayList<Star> space, int xDimension, int yDimension) {
        setTitle("Google Space");
        setSize(2000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        panel.setPreferredSize(new Dimension(xDimension, yDimension));
        panel.setBackground(Color.BLACK);

        for (Star star : space){
            star.setBounds(star.getX(), star.getY(), starDimension, starDimension);
            panel.add(star);
        }

        JScrollPane scrollPane = new JScrollPane(panel);

        add(scrollPane);
    }

    
}