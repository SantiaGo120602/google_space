import javax.swing.SwingUtilities;

import view.Space;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Space frame = new Space();
            frame.setVisible(true);
        });
    }
}
