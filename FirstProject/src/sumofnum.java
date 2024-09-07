package src;
import java.util.Scanner;

public class sumofnum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Sum of numbers");
        System.out.println("Enter your number");
        int num = input.nextInt();
        int sum = SumOfNum(num);
        System.out.println("Value of num is : " + sum);
    }
    public static int SumOfNum(int num){
        int sum = 0;
        while(num > 0){
         sum += num % 10;
         num /=10;
        }
        return sum;
    }
}
