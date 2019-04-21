package model;

import sound.MidiSynth;

import java.awt.*;

public class Rectangle extends Shape{


    public Rectangle(Point topLeft, MidiSynth midiSynth) {
        super(topLeft, midiSynth);
        instrument = 1;
    }

    public Rectangle(int x, int y, int w, int h) {
        super(x, y, w, h);
    }

    @Override
    // EFFECTS: draws the rectangle
    protected void drawGraphics(Graphics g) {
        g.drawRect(x, y, width, height);
    }

    @Override
    //EFFECTS: fills the shape
    protected void fillGraphics(Graphics g) {
        g.fillRect(x, y, width, height);
    }


    @Override
    // EFFECTS: return true if the given Point (x,y) is contained within the bounds of this Shape
    public boolean contains(Point point) {
        int point_x = point.x;
        int point_y = point.y;

        return containsX(point_x) && containsY(point_y);
    }

}
