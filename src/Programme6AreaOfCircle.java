import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).
 */
public class Programme6AreaOfCircle {
    public static void main(String[] args) {
        // Scanner Declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius");
        double radius = scanner.nextDouble();
        AreaOfCircle(radius);
        // closing the scanner object
        scanner.close();
    }
    // Claculating the area of circle
    public static void AreaOfCircle(double radius) {
        double pi = Math. PI;
        double area = (pi * radius*radius);
        System.out.println(" The Area of circle is:" + area);
    }

}
