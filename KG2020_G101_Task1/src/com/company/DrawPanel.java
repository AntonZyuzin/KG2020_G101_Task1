package com.company;

import javax.swing.*;
import java.awt.*;


public class DrawPanel extends JPanel {
    private Stars st = new Stars();
    private Island is = new Island();
    private Man m = new Man(760, 500);


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D gr = (Graphics2D) g;
        is.draw(gr);
        st.draw(gr);
        m.draw(gr);

    }
}
