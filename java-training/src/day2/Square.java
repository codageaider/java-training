package day2;

public class Square implements Shape{
    public double side;
    Square(double _side){
        side = _side;
    }
    @Override
    public double getArea() {
        return side*side;
    }
}
