package src;
import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("Please enter your number");
        int first = input.nextInt();
        int second = input.nextInt();
        int lcm = LCM(first,second);
        System.out.println("Lcm of number is " + lcm);
    }

    public static int LCM(int first, int second){
        int i = 1;
        while(i<= second){
          int factor = first * i;
          if(factor % second == 0){
             return factor;
          }
          i++;
        }
        return 0;
    }
}
