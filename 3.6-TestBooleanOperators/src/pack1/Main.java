package pack1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

        System.out.print("Enter in integer: ");
        int number = input.nextInt();

        if(number % 2 == 0 && number % 3 == 0)
            System.out.printf("%s is divisible by 2 and 3. \n", number);
        if(number % 2 == 0 || number % 3 == 0)
            System.out.printf("%s is divisible by 2 or 3. \n", number);
        if(number % 2 == 0 ^ number % 3 == 0)
            System.out.printf("%s is divisible by 2 or 3, but not both. \n", number);
    }
}
