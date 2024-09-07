package src;
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Swapping of numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("Value of a" + a);
        System.out.println("value of b" + b);
    }
}