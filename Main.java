import java.util.*;


public class Main {
    public static void main(String[] args) {

        System.out.println("Leap Year Determining Program\n");

        int knownLeapYear;  // an actual leap year to be used as a reference
        Scanner input = new Scanner(System.in);  // variable to be used to save user's input

        System.out.println("Enter a year in 'yyyy' format:");
        int year = input.nextInt();  // save user's input

        knownLeapYear = 2020;
        int differenceInYear = year - knownLeapYear;
        boolean leapYearCalculator = differenceInYear % 4 == 0;

        if (leapYearCalculator == true) {
            System.out.println("The year of " + year + " is indeed a leap year");
        }
        else {
            System.out.println("The year of " + year + " is NOT a leap year");
        }



    }
}