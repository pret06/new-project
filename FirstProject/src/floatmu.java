package src;
import java.util.Scanner;

public class floatmu {
    public static void main(String[] args) {
        System.out.println("Floating multiplication");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first value");
        double first = input.nextInt();
        System.out.println("Enter the second value");
        double second = input.nextInt();

        double mult = first * second;
        System.out.println("\n Result is " + mult);
    }
}
