package src;
import java.util.Scanner;

public class multiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Multiplication Table");
        System.out.println("Enter your number");
        int num = scanner.nextInt();
        PrintMultiplicationTable(num);
        
    } 
    public static void PrintMultiplicationTable(int num) {
      int i = 1;
      while(i<=10){
       System.out.println(num + "X" + i + "=" + (num * i));
       i++;
      }    
}
}



