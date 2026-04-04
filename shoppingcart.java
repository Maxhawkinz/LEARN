// shopping cart program
import java.util.Scanner;

public class shoppingcart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("What item would you like to buy?: ");
        String item = scanner.nextLine();
        System.out.println("What is the price for each?: ");
        double cost = scanner.nextDouble();
        System.out.println("How many would you like?: ");
        int quantity = scanner.nextInt();
        double total = cost * quantity;
        System.out.println("You have bought "+quantity+" " +item +"/s");
        System.out.println("Your total is $"+total);
        scanner.close();
    }
}
