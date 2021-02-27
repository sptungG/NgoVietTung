/*
2.2.5
Write a program to calculate sum,difference,product, and quotient of 2 double numbers which are entered by users.
Notes
- To convert from String to double, you can use
         double num1 = Double.parseDouble(strNum1)
- Check the divisor of the division
*/
import javax.swing.JOptionPane;

public class CalculateTwoNumbers{
    public static void main(String[] args) {
        String strNum1 =  JOptionPane.showInputDialog(null, "Input the first number",null, JOptionPane.INFORMATION_MESSAGE);
        String strNum2 =  JOptionPane.showInputDialog(null, "Input the second number",null, JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        if(num2 == 0){
            JOptionPane.showMessageDialog(null,"Sum:"+ num1 + "+" + num2 + " = " + (num1+num2) +"\nDifference:" + num1 + "-" + num2 + " = " + (num1-num2) +"\nProduct:"+num1 + "*" + num2 + " = " + (num1*num2)+"\nDivision: "+num1 + "/" + num2 + " = " + "Error", "Result", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,"Sum:"+ num1 + "+" + num2 + " = " + (num1+num2) +"\nDifference:" + num1 + "-" + num2 + " = " + (num1-num2) +"\nProduct:"+num1 + "*" + num2 + " = " + (num1*num2)+"\nDivision: "+num1 + "/" + num2 + " = " + (num1/num2), "Result", JOptionPane.INFORMATION_MESSAGE);
        }
        System.exit(0);
    }
}