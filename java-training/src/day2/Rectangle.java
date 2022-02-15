package day2;

public class Rectangle implements Shape{
    private double width;
    private double height;

    Rectangle(double _width, double _height){
        width=_width;
        height=_height;
    }
    public double getArea(){
        return width*height;
    }

    @Override
    public double getPerimeter() {
        return 2*(width+height);
    }
}
/*
(i) Both have getArea() method
(ii) They both are shapes
(iii) any new such class will also have a getArea() method.
 */
