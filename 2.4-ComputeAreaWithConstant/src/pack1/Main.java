package pack1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    final double PI = 3.14159;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a nuumber for radius: ");
        double radius = input.nextDouble();

        double area = radius * radius * PI;

        System.out.print("The area for the cirlce of radius " + radius + " is " + area);
    }
}
