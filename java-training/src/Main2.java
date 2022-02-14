import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // to calculate the area of a circle.
        // pi * radius * radius
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        double radius = scanner.nextDouble();
        double area = radius * radius * Math.PI;
        System.out.println("area of the circle = "+area);

    }
}
