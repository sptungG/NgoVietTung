/*
6.4
Write a program to display the number of days of a month, which is entered by users
(both month and year). If it is an invalid month/year, ask the user to enter again.
*/
import java.util.Scanner;

public class daysOfMonth {
  public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        int numberOfDays = 0; 
        String nameOfMonth = "Unknown";
        int month,year;

        System.out.print("Input a month number: ");
        month = input.nextInt();
        System.out.print("Input a year: ");
        year = input.nextInt();
    while( month < 0 || month > 12 || year < 0){
        System.out.print("[ERROR]Try again, Input a month number: ");
        month = input.nextInt();
        System.out.print("[ERROR]Try again, Input a year: ");
        year = input.nextInt();
    }
        switch (month) {
            case 1:
            nameOfMonth = "January";
            numberOfDays = 31;
                break;
            case 2:
            nameOfMonth = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    numberOfDays = 29;
                } else {
                    numberOfDays = 28;
                }
                break;
            case 3:
            nameOfMonth = "March";
            numberOfDays = 31;
                break;
            case 4:
            nameOfMonth = "April";
            numberOfDays = 30;
                break;
            case 5:
            nameOfMonth = "May";
            numberOfDays = 31;
                break;
            case 6:
            nameOfMonth = "June";
            numberOfDays = 30;
                break;
            case 7:
            nameOfMonth = "July";
            numberOfDays = 31;
                break;
            case 8:
            nameOfMonth = "August";
            numberOfDays = 31;
                break;
            case 9:
            nameOfMonth = "September";
            numberOfDays = 30;
                break;
            case 10:
            nameOfMonth = "October";
            numberOfDays = 31;
                break;
            case 11:
            nameOfMonth = "November";
            numberOfDays = 30;
                break;
            case 12:
            nameOfMonth = "December";
            numberOfDays = 31;
        }
        System.out.print("----" + nameOfMonth + "/" + year + " has " + numberOfDays + " days\n");
      
    input.close();
}
}
