package src;
import java.util.Scanner;

public class oddsum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("OddSum Addition");
        int num = input.nextInt();
        int sum = OddSum(num);
        System.out.println("oddSum " + num + " is : " + sum);  
    }
    public static int OddSum(int num){
      int sum = 0;
      int i = 1;

      while (i <= num) {
        sum += i;
        i += 2;
      }
      return sum;
    }
}
