package src;
import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to All Arithmetic");
        System.out.println("Enter the first value");
        int a = input.nextInt();
        System.out.println("Enter the second value");
        int b = input.nextInt();

        int add = a+b;
        int sub = a-b;
        int multiply = a*b;
        int divide = a/b;
        int module = a%b;

        System.out.println("value of add " + add);
        System.out.println("value of sub " + sub);
        System.out.println("value of multiply " + multiply);
        System.out.println("value of divide " + divide);
        System.out.println("value of module " + module);
    }
    
}
