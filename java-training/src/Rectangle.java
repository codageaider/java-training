public class Rectangle {
    Point topLeftPoint; // composition
    Point bottomRightPoint;

    Rectangle(Point _topLeftPoint, Point _bottomRightPoint){
        topLeftPoint=_topLeftPoint;
        bottomRightPoint=_bottomRightPoint;

    }
    public double getArea(){
      return getWidth() * getHeight();
    }
    public double perimeter(){
        return getWidth()*2 + getHeight()*2;
    }
    public double getWidth(){
        return bottomRightPoint.xCoordinate-topLeftPoint.xCoordinate;
    }
    public double getHeight(){
        return topLeftPoint.yCoordinate - bottomRightPoint.yCoordinate;
    }
}

