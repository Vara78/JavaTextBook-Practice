package pack1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

	    int number1 = (int)(System.currentTimeMillis() % 10);
	    int number2 = (int)(System.currentTimeMillis() / 10 % 10);

        System.out.printf("What is %s + %s?: ", number1, number2);
        int answer = input.nextInt();

        System.out.printf("%s + %s = %s", number1, number2, (number1 + number2));
    }
}