public class Problems {
    public static void main(String[] args) {
        Point x = new Point(1, 2);
        Point y = new Point(2, 3);
        System.out.println(distance(x, y));
    }

    // write  a function that takes 4 integers x1,y1 x2, y2
    // and returns the distance between these two points.
    // sqrt[(x1-x2)^2 + (y1-y2)^2]
    public static double distance(int x1, int y1, int x2, int y2) {
        return (Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
    // (i) this is more readable.
    // (ii) code in the language of domain
    public static double distance(Point x, Point y) {
        return Math.sqrt(Math.pow((x.xCoordinate - y.xCoordinate), 2)
                + Math.pow((x.yCoordinate - y.yCoordinate), 2));
    }
    // Object oreiented programming -> To create custom objects.
    // int, long, String

}
