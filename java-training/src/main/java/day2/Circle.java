package day2;

public class Circle implements Shape {
    private double radius; // instance variable
    // make instance variables always private. This is consider
    // a good programming practice
    // classes must be robust
    Circle(double _radius) throws Exception {
        if(_radius<=0)
            throw new Exception("Radius should be a positive number");
        radius=_radius;
    }
    public double getArea(){
        return radius * radius*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return Math.PI*2*radius;
    }
    public void test(){
        int x = 1; // local variable
    }
}
