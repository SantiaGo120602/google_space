import javax.swing.SwingUtilities;

import controller.SpaceController;
import view.Space;

public class Main {
    public static void main(String[] args) {
        SpaceController controller = new SpaceController(200, 6000, 3000);
        SwingUtilities.invokeLater(() -> {
            Space frame = controller.getView().getSpace();
            frame.setVisible(true);
        });
    }
}
