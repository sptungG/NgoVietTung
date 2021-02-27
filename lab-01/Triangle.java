/*
6.3
Write a program to display a triangle with a height of n stars (*), n is entered by users.

*/

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter height: n = ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        scanner.close();
	}
}
