package src;
import java.util.Scanner;

public class arrayutility {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Sum of arrays");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while(i < size){
            System.out.print("please enter the element " + (i + 1)+ ": ");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;
    }
    
}
