package src;
import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("Please enter your number");
        int first = input.nextInt();
        System.out.println("Please enter your number");
        int second = input.nextInt();
        int gcd = gcdsum(first,second);
        System.out.println("gcd of number is " + gcd);
    }

    public static int gcdsum(int num1, int num2){
        int gcd = 1;
        int i = 2;
        int least = least(num1, num2);
        while(i<=least){
           if(num1 % i == 0 && num2 % i == 0){
            gcd = i;
           }
           i++;
        }
        return gcd;
    }

    public static int least(int num1, int num2){
        if(num1<num2){
            return num1;
        } else{
         return num2;
        }
    }
}
