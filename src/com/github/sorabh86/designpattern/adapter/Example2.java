package com.github.sorabh86.designpattern.adapter;

// Target interface
interface Shape {
    void draw();
    void resize();
}

// Adaptee class
class LegacyRectangle {
    public void draw(int x1, int y1, int x2, int y2) {
        System.out.println("Drawing rectangle at points (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ")");
    }
}

// Adapter class
class RectangleAdapter implements Shape {
    private LegacyRectangle rectangle;

    public RectangleAdapter(LegacyRectangle rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public void draw() {
        rectangle.draw(0, 0, 10, 10);
    }

    @Override
    public void resize() {
        System.out.println("Resizing rectangle");
    }
}

// Client code for Adapter Pattern Example
public class Example2 {
    public static void main(String[] args) {
        Shape rectangle = new RectangleAdapter(new LegacyRectangle());
        rectangle.draw();
        rectangle.resize();
    }
}
