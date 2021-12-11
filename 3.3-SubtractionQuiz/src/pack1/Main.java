package pack1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        if(number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        System.out.printf("What is %s - %s?: ", number1 , number2);
        int answer = input.nextInt();

        if(number1 - number2 == answer) {
            System.out.print("You are correct!");
        } else {
            System.out.println("Your answer is wrong.");
            System.out.printf("%s - %s = %s", number1, number2 , (number1 - number2));
        }
    }
}
