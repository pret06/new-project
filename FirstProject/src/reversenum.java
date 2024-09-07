package src;
import java.util.Scanner;

public class reversenum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to reverse Number");
        System.out.print("Enter your number ");
        int num = input.nextInt();
        int reversenum = reverse(num);
        System.out.println("your reverse number is " + reversenum);
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
