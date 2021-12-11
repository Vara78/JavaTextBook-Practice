package pack1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();

        double tax = purchaseAmount * .06;
        System.out.printf("Sales tax is $%s", (int)(tax * 100) / 100.0);
    }
}
