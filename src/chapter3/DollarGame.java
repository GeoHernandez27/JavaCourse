package chapter3;

import java.util.Scanner;

public class DollarGame {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        double penny = .01;
        double nickel = .05;
        double dime = .10;
        double quarter = .25;
        int dollar = 1;

        System.out.println("Welcome to my Dollar Game!" +
                " Your goal is to enter enough change to make exactly $1.00");

        System.out.println("Enter your pennies: ");
        int numOfPennies = scanner.nextInt();

        System.out.println("Enter your nickels: ");
        int numOfNickels = scanner.nextInt();

        System.out.println("Enter your dimes: ");
        int numOfDimes = scanner.nextInt();

        System.out.println("Enter your quarters: ");
        int numOfQuarters = scanner.nextInt();


        scanner.close();

        double total = numOfPennies * penny + numOfNickels * nickel +
                numOfDimes * dime + numOfQuarters * quarter;

        if(total < dollar){
            double amountShort = dollar - total;
            System.out.println("Sorry, you lose! You were short " + String.format("%.2f", amountShort) + " cents.");
        }
        else if (total > dollar) {
            double amountOver = total - dollar;
            System.out.println("Sorry, you lose! You were over " + String.format("%.2f", amountOver) + " cents.");
        }
        else {
            System.out.println("Congrats! You win. That's exactly $1.00!");
        }

    }
}
