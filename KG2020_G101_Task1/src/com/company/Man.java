package com.company;

import java.awt.*;

public class Man implements Drawable {

    private int x,y;

    public Man (int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics2D g) {
        drawMan(g, x, y);
    }


    public void drawMan(Graphics2D g, int x, int y) {

        g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);


        g.setPaint(Colors.color12);
        g.fillRect(x, y, 30, 30);

        g.setPaint(Colors.color7);
        g.fillRect(x, y + 10, 10, 7);
        g.fillRect(x + 20, y + 10, 10, 7);

        g.setPaint(Colors.color9);
        g.fillRect(x, y + 80, 10, 20);
        g.fillRect(x + 20, y + 80, 10, 20);
        g.fillRect(x + 6, y + 10, 4, 7);
        g.fillRect(x + 20, y + 10, 4, 7);
        g.fillRect(x + 14, y, 4, 20);
        g.fillRect(x + 14, y + 24, 7, 4);

        g.setPaint(Colors.color10);
        g.fillRect(x, y + 30, 30, 50);

        g.setPaint(Colors.color11);
        g.fillRect(x - 5, y + 35, 10, 35);
        g.fillRect(x + 29, y + 35, 5, 35);
    }
}
