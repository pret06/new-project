package src;
import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to ArmStrong");
        System.out.println("enter your number");
        int num = input.nextInt();
        boolean isArmStrong = isArmStrong(num);
        if(isArmStrong){
            System.out.print("Number is ArmStrong");
        } else {
            System.out.print("Numer is not ArmStrong");
        }
}

    public static boolean isArmStrong(int num){
        int noOFdigits = NoOfDigit(num);
        int finalnumber = 0;
        int numcopy = num;
        while (num > 0){
            int lastdigit = num % 10;
            num /= 10;
            finalnumber += pow(lastdigit, noOFdigits);
        }
        return finalnumber == numcopy;
} 
    public static int pow(int num1 , int num2){
        int result = 1;
        int i = 0;
        while (i< num2) {
            result *= num1;
            i++;
        }
        return result;
    }

    public static int NoOfDigit(int num){
        int digits = 0;
        while(num > 0){
            digits++;
            num /= 10;
        }
        return digits;
    }
}
