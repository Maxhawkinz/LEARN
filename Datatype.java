// for variable and datatype
public class Datatype {

    public static void main(String[] args){

        int age = 30;
        int year = 2025;
        int quantity = 1;

        double price = 19.99;
        double gpa = 3.5;
        double temperature = -12.5;
        System.out.println("price ="+ price);
        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = false;
        boolean forSale = true;
        boolean isOnline = false;

        String name = "Ajay Thakare";
        String food = "pizza";
        String email = "ajaythakare500@gmail.com";
        String car = "Mustang";
        String color = "red";
        System.out.println( "your favourite food is :"+food);
        System.out.println("Hello " + name);
        System.out.println("email_id: "+email);
        System.out.println("the car you like is:"+car);

        System.out.println("hii "+ name);
        System.out.println("You are "+ age + "years old");

        System.out.println("Your choice is "+ color + " "+year+ " "+car);
        System.out.println("The price is : "+ price);

        if(forSale){
            System.out.println("There is a " + car + " for sale");
        }
        else{
            System.out.println("There is a " + car + " not for sale");

        }

}
}