// This code takes user input and gives area of rectangle.
// for better understanding of user input and datatypes.
import java.util.Scanner;

public class areaofrect {
    public static void main(String[] args) {

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width: ");
        width = scanner.nextDouble();

        System.out.println("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;
        System.out.println("The area is: " + area + "cm²");

    }
}
