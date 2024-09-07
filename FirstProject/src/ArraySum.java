package src;

public class ArraySum {
    public static void main(String[] args) {
        System.out.println("Welcome to sum of Arrays");
        int[] newArray = arrayutility.inputArray();
        long sum = sum(newArray);
        int avg = averg(newArray);
        System.out.println("sum of the numbers is : " + sum);
        System.out.println("Sum of the average is : " + avg);

    }

    public static long sum(int[] newArray) {
        long sum = 0;
        int i = 0;
        while (i < newArray.length) {
            sum += newArray[i];
            i++;
        }
        return sum;
    }

    public static int averg(int[] newArray) {
        long sum = sum(newArray);
        return (int) (sum/newArray.length);
    }
}
