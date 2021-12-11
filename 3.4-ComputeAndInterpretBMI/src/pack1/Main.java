package pack1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;

        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();
        double heightInMeters = height * METERS_PER_INCH;

        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        System.out.printf("BMI is %s\n", bmi);

        if(bmi < 18.5)
            System.out.print("Underweight");
        else if(bmi < 25)
            System.out.print("Normal");
        else if(bmi < 30)
            System.out.print("Overweight");
        else
            System.out.print("Obese");
    }
}
