package src;
import java.util.Scanner;

public class fibnacoi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to fibnocai series");
        System.out.println("enter your number");
        int num = input.nextInt();
        fibnacoiSeries(num);
    }
    public static void fibnacoiSeries(int num){
        if(num < 0) return; 
        System.out.print("0 ");
        if(num == 0) return;
        System.out.print("1 ");
        int first = 0, second = 1;

        while(first + second <= num){
            int third = first + second;
            System.out.println(third + " ");
            first = second;
            second = third;
        }
    }   
}
