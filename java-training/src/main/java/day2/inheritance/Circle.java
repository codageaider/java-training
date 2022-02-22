package day2.inheritance;

import java.util.Objects;

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

    @Override
    public String toString() {
        return super.toString() + " , radius = "+radius;
    }

    @Override
    public boolean equals(Object o) {
          Circle circle = (Circle)o;
          if(circle.getRadius()==radius)
              return true;
          return false;
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Circle circle = (Circle) o;
//        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
