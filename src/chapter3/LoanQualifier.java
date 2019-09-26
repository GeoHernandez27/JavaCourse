package chapter3;

/*
NESTED IFS:
To qualify for a loan,  a person must make at least $30k
and have been working at their current job for at least 2 years.
 */

import java.util.Scanner;

public class LoanQualifier {

    public static void main(String args[]) {
//        Initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

//        get what we don't
        System.out.println("Enter Salary:");
        Scanner scanner = new Scanner(System.in);
        double salary  = scanner.nextDouble();

        System.out.println("Enter years with your employer:");
        double years = scanner.nextDouble();

        scanner.close();

//        make a decision-output
        if(salary >= requiredSalary) {
            if(years >= requiredYearsEmployed) {
                System.out.println("You've been approved!");
            } else {
                System.out.println("Sorry, you must have worked at your current job "
                + requiredYearsEmployed + " years.");
            }
        }
        else {
         System.out.println("Sorry, you must earn at least $" + requiredSalary + " to qualify.");
        }
    }

}
