package src;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to palindrome Number");
        System.out.print("Enter your number ");
        int num = input.nextInt();
        boolean ispalindrome = ispalindrome(num);
        if (ispalindrome) {
            System.out.print("Number is Palindrome");
        } else {
            System.out.print("Numer is not Palindrome");
        }
    }

    public static boolean ispalindrome(int num){
        return num == reverse(num);
    }

    public static int reverse(int num){
        int newnum = 0;
        while(num > 0) {
          int digit = num % 10;
          newnum = newnum * 10 + digit;
          num /= 10;
        }
        return newnum;
    }
}
