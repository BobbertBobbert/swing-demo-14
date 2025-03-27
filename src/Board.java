import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;

import static utils.Constants.BOARD_WIDTH;
import static utils.Constants.BOARD_HEIGHT;


public class Board extends JPanel {

    public Board() {
        setPreferredSize(new Dimension(BOARD_WIDTH, BOARD_HEIGHT));
        setBackground(ColorUIResource.black);
    }
}
