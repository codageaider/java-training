package day2;

public class Circle implements Shape {
    private double radius;
    Circle(double _radius){
        radius=_radius;
    }
    public double getArea(){
        return radius * radius*Math.PI;
    }
}
