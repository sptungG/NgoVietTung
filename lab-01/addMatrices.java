/*
6.6
Write a Java program to add two matrices of the same size
*/
import java.util.Scanner;

public class addMatrices{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n;
        System.out.print("Enter the Size of matrix: n = ");
        n = scanner.nextInt();

        int matrix1[][] = new int[n][n];
        int matrix2[][] = new int[n][n];
        int matrixSum[][] = new int[n][n];

        System.out.println("---Enter elements of the first matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("a[%d][%d]: ",i+1,j+1);
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("---Enter elements of the second matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("b[%d][%d]: ",i+1,j+1);
                matrix2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("----Sum of two matrices:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrixSum[i][j] + "\t");
            }
            System.out.println("");
        }
        
        scanner.close();
    }
}