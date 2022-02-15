package day2.inheritance;

public class Rectangle extends Shape{
    private double width;
    private double height;

    Rectangle(double _width, double _height, boolean _filled, String color){
        super(color, _filled);
        width=_width;
        height=_height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
