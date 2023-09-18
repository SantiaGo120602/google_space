package view;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

class CustomPanel extends JPanel {
    private final List<Component> componentsToRender = new ArrayList<>();

    public void addComponentToRender(Component component) {
        componentsToRender.add(component);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Component component : componentsToRender) {
            // Manually paint each component
            Graphics2D g2d = (Graphics2D) g.create();
            component.paint(g2d);
            g2d.dispose();
        }
    }
}