package com.company;

import java.awt.*;

public class Island implements Drawable {
    @Override
    public void draw(Graphics2D g) {

        drawBG(g);
        drawIsland(g);

    }

    public static void drawBG(Graphics2D gr){
        GradientPaint gr1 = new GradientPaint(0, 360, Colors.color1, 0, 20, Colors.color2);
        GradientPaint gr2 = new GradientPaint(0, 1080, Colors.color2, 0, 720, Colors.color1);
        gr.setPaint(gr1);
        gr.fillRect(0, 0, 1920, 1080);
        gr.setPaint(gr2);
        gr.fillRect(0, 720, 1920, 720);
        gr.setPaint(gr1);
        gr.fillRect(0, 0, 1920, 1080);
        gr.setPaint(gr2);
        gr.fillRect(0, 720, 1920, 720);
    }

    public static void  drawIsland(Graphics2D g){

        g.setColor(Colors.color8);
        g.fillOval(1470, 623, 230, 20);

        g.setColor(Colors.color3);
        g.fillRect(700,440, 500,160);

        g.setColor(Colors.color4);
        g.fillRect(750, 420, 320, 30);
        g.fillRect(810, 380, 220, 40);

        g.setColor(Colors.color3);
        g.fillOval(620, 440, 100, 190);
        g.fillOval(690, 400, 100, 190);
        g.fillOval(1020, 410, 100, 190);
        g.fillOval(1080, 405, 100, 190);
        g.fillOval(1140, 430, 100, 190);
        g.fillOval(1200, 490, 90, 150);
        g.fillOval(485,638, 845, 5);

        g.setColor(Colors.color13);
        g.fillOval(1090, 520, 100, 115);
        g.setPaint(Colors.color3);
        g.fillOval(1080, 555, 55, 55);
        g.setColor(Colors.color13);
        g.fillOval(1095, 560, 40, 50);
        g.fillOval(620, 520, 100, 115);
        g.setPaint(Colors.color3);
        g.fillOval(675, 555, 55, 55);
        g.setColor(Colors.color13);
        g.fillOval(675, 560, 40, 50);


        g.setColor(Colors.color4);
        g.fillRect(500, 600, 830, 40);
        g.fillRect(485, 612, 15, 28);
        g.fillRect(520, 550, 30, 50);
        g.fillRect(960, 505, 30, 30);
        g.fillRect(570, 535, 30, 65);
        g.fillRect(1000, 550, 30, 50);
        g.fillRect(980, 535, 30, 65);
        g.fillRect(1260, 570, 30, 30);


        g.setColor(Colors.color5);
        int xp = 810;
        int yp = 590;
        for (int i = 0; i < 3; i++){
            yp -= 18;
            g.fillRect(810, yp, 40, 6);
        }

        for (int i = 0; i < 4; i++){
            xp += 20;
            yp -= 18;
            g.fillRect(xp, yp, 40, 6);
        }
        g.fillRect(930, 505, 30, 30);
        g.fillRect(550, 550, 20, 50);
        g.fillRect(600, 535, 60, 65);
        g.fillRect(920, 535, 60, 65);
        g.fillRect(1230, 570, 30, 30);
        g.fillRect(860, 415, 170, 5);
        g.fillRect(810, 380, 20, 40);

        g.setColor(Colors.color6);
        g.fillRect(510, 623, 60, 9);
        g.fillRect(580, 606, 60, 9);
        g.fillRect(660, 624, 60, 9);
        g.fillRect(750, 600, 60, 9);
        g.fillRect(900, 615, 60, 9);
        g.fillRect(980, 626, 60, 9);
        g.fillRect(1210, 610, 60, 9);

        g.fillRect(800, 425, 55, 8);
        g.fillRect(910, 433, 55, 8);
        g.fillRect(860, 390, 50, 6);
        g.fillRect(935, 400, 50, 6);



    }
}
