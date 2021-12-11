package pack1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean running = true;

        do{
            System.out.println("_________________________________");
            System.out.println("Press 1 for Celsius to Fahrenheit");
            System.out.print("Press 2 for Fahrenheit to Celsius: ");
            int userInput = input.nextInt();

            if(userInput == 1) {

                System.out.print("\nEnter degree in Celsius: ");
                int celsius = input.nextInt();
                System.out.printf("Celsius %s is Fahrenheit degree: ", celsius);
                System.out.println(celsius += 32);

            } else if(userInput == 2) {

                System.out.print("\nEnter degree in Fahrenheit: ");
                int fahrenheit = input.nextInt();
                System.out.printf("Fahrenheit %s is Celsius degree: ", fahrenheit);
                System.out.println(fahrenheit -= 32);

            } else {
                System.out.println("Invalid option, try again");
            }
        }while(running);
    }
}
