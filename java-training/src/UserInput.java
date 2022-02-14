import java.sql.PreparedStatement;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // to calculate the area of a circle.
        // pi * radius * radius
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        double radius = scanner.nextDouble();
        double area = radius * radius * Math.PI;
        System.out.println("area of the circle = "+area);
        // write a code to display the value of 2^3.5

       PrintTriangle.printTriangle(7);

        // function resuability
        // Duplicate code X Bad programming practice.
        // Try to avoid writing duplicate code.
        // DRY - don't repeat yourself
        //(i) You will be making changes only in one place
        // (ii) It is more readable
    }
}
