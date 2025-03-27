import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;

public class Board extends JPanel {

    public Board() {
        setPreferredSize(new Dimension(140, 140));
        setBackground(ColorUIResource.black);
    }
}
