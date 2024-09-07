package src;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Prime checker");
        System.out.print("Enter your number ");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
            if (isPrime) {
                System.out.print("number is prime");
            } else {
                System.out.print("number is not prime");
            }
        }

    public static boolean isPrime(int num){
        int i = 2;
        while (i < num) {
            if(num % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
