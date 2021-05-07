/*
6.5
Write a Java program to sort a numeric array, and calculate the sum and average value of array elements
*/
import java.util.Arrays;
import java.util.Scanner;

public class sortArray {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter number of elements of array: ");
      int n = scanner.nextInt();

      double arr[] = new double[n];
      System.out.println("Enter elements of the array: ");
      for (int i = 0; i < n; i++) {
           System.out.printf("arr[ %d ]: ",i+1);
           arr[i] = scanner.nextDouble();
      }

      Arrays.sort(arr);
      System.out.println("Sorted numeric array: " + Arrays.toString(arr));

      double sum = 0;
      for (int i = 0; i < n; i++) {
          sum = sum + arr[i];
      }
      double average = sum / n;
      System.out.println("Sum: " + sum);
      System.out.println("Average: " + average);


      scanner.close();
    }
}
