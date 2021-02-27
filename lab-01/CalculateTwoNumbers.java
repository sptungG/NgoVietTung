/*
2.2.5
Write a program to calculate sum,difference,product, and quotient of 2 double numbers which are entered by users.
Notes
- To convert from String to double, you can use
         double num1 = Double.parseDouble(strNum1)
- Check the divisor of the division
*/
import java.util.Scanner;

public class CalculateTwoNumbers{
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);

        System.out.print("Input 1st integer: ");
        int num1 = calc.nextInt();
        System.out.print("Input 2nd integer: ");
        int num2 = calc.nextInt();
        
        System.out.printf("Sum: %d\n", num1 + num2);
        System.out.printf("Difference: %d\n", num1 - num2);
        System.out.printf("Product: %d\n", num1 * num2);
        if(num2 == 0) {
            System.out.printf("Quotient: Error\n");
        }else {
            float quotient = (float)num1 / num2;
            System.out.printf("Quotient: %f\n", quotient);
        }        
        calc.close();
        System.exit(0);

    }
}