package day2.inheritance;

public class Circle extends Shape {
    private double radius;

      Circle(){

      }
      Circle(double _radius){
          radius=_radius;
      }
      Circle(double _radius, String color, boolean filled){
          radius=_radius;
          setColor(color);
          setFilled(filled);
      }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
          return Math.PI*radius*radius;
    }

}
