/*
2.2.6
Write a program to solve:
For simplicity, we only consider the real roots of the equations in this task.
- The first-degree equation (linear equation) with one variable
- The system of first-degree equations (linear system) with two variables
- The second-degree equation with one variable.
*/
import java.util.Scanner;
public class Equations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int select;
        do{
            System.out.println("===========MENU===========");
            System.out.println("1, The first-degree equation (linear equation) with one variable.");
            System.out.println("2, The system of first-degree equations (linear system) with two variables.");
            System.out.println("3, The second-degree equation with one variable.");
            System.out.println("4, Exit!");
            System.out.printf("=>Enter your choice: ");
            select = scanner.nextInt();
            // System.out.println(select);
            switch(select){
                case 1:{
                    System.out.print("Input 1st integer: ");
                    int a = scanner.nextInt();
                    System.out.print("Input 2nd integer: ");
                    int b = scanner.nextInt();
                    
                    System.out.printf("The Equation: %d.x + %d = 0\n",a,b);
                    if(a == 0 && b != 0) {
                        System.out.printf("--No Solution.\n");
                    }else if(a == 0 && b == 0){
                        System.out.printf("--Infinite Solution.\n");
                    }else{
                        float quotient = (float) -b / a;
                        System.out.printf("--Solution of your Equation: x = %f\n", quotient);
                    }       
                    break;
                }
                case 2:{
                    System.out.print("\na11x1 + a12x2 = b1\n");
                    System.out.print("\tInput a11: ");
                    int a11 = scanner.nextInt();
                    System.out.print("\tInput a12: ");
                    int a12 = scanner.nextInt();
                    System.out.print("\tInput b1: ");
                    int b1 = scanner.nextInt();

                    System.out.print("\na21x1 + a22x2 = b2\n");
                    System.out.print("\tInput a21: ");
                    int a21 = scanner.nextInt();
                    System.out.print("\tInput a22: ");
                    int a22 = scanner.nextInt();
                    System.out.print("\tInput b2: ");
                    int b2 = scanner.nextInt();
                    System.out.printf("The System:\n\t %dx1 + %dx2 = %d\n\t %dx1 + %dx2 = %d\n",a11,a12,b1,a21,a22,b2);
                    float D = (float) a11*a22 - a12*a21;
                    float D1 = (float) b1*a22 - b2*a12;
                    float D2 = (float) a11*b2 - a21*b1;
                    if(D != 0){
                        System.out.printf("--Solution: \n" + "\tx1 = " + D1/D + "\n" + "\tx2 = " + D2/D +"\n");
                    }else if(D1 == 0 && D2 == 0){
                        System.out.printf("--Infinite Solution.\n");
                    }else{
                        System.out.printf("--No Solution.\n");
                    }
                    break;
                }
                case 3:{
                    System.out.print("\nax^2 + bx + c = 0\n");
                    System.out.print("\tInput a: ");
                    int a = scanner.nextInt();
                    System.out.print("\tInput b: ");
                    int b = scanner.nextInt();
                    System.out.print("\tInput c: ");
                    int c = scanner.nextInt();
                    float delta = (float) b*b - 4*a*c;
                    System.out.printf("The Equation: %dx^2 + %db +%d = 0\n",a,b,c);
                    if(delta == 0){
                        System.out.printf("--Solution: \n"+"\tx = " + -b/(2*a)+"\n");
                    }else if(delta > 0){
                        System.out.printf("--Solution: \n" + "\tx1 = " + (-b+Math.sqrt(delta))/(2*a) + "\n" + "\tx2 = " + (-b-Math.sqrt(delta))/(2*a)+"\n");
                    }else{
                        System.out.printf("--No Solution.\n");
                    }
                    break;
                }
                case 4:{
                    System.out.println("EXIT!");
                    break;
                }
                default:{
                    System.out.println("[ERROR]Invalid. Choose again!\n");
                    break;
                }
            }
        }while(select != 4);
        
    }
}

