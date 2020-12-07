package com.company;

import java.awt.*;

public class Stars implements Drawable {


    @Override
    public void draw(Graphics2D g) {
        drawStars(g);

    }

    public static int rnd_x(int max_x, int min_x) {
        max_x -= min_x;
        return (int) (Math.random() * ++max_x) + min_x;
    }

    public static int rnd_y(int max_y, int min_y) {
        max_y -= min_y;
        return (int) (Math.random() * ++max_y) + min_y;
    }

    public static void drawStars(Graphics2D g) {

        Graphics2D gr = (Graphics2D) g;
        g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g.setColor(Colors.color7);
        g.fillOval(1500, 200, 170, 170);
        for (int i = 0; i < 10; i++) {
            gr.fillRect(rnd_x(100, 1400), rnd_y(150, 320), 15, 15);
        }
        g.setPaint(Colors.color4);
        for (int i = 0; i < 15; i++) {
            g.fillRect(rnd_x(670, 900), rnd_y(470, 550), 2, 2);
        }
        for (int i = 0; i < 15; i++) {
            g.fillRect(rnd_x(1050, 1200), rnd_y(470, 550), 2, 2);
        }
        g.setColor(Colors.color8);
        for (int i = 0; i < 17; i++) {
            g.fillOval(rnd_x(1520,1650 ), rnd_y(220, 350), 4, 4);
        }
    }
}
