package pack1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount in double, e.g., 11.56: ");
        double amount = input.nextDouble();

        int remainingAmount = (int) (amount * 100);
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        int numberOfPennies = remainingAmount;

        System.out.printf("Your amount $%s consists of:\n%s dollars\n%s quarters\n%s dimes\n%s nickels\n%s pennies",
                amount, numberOfOneDollars, numberOfQuarters, numberOfDimes, numberOfNickels, numberOfPennies);
    }
}
