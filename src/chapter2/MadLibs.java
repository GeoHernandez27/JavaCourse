package chapter2;

import java.util.Scanner;

public class MadLibs {

    public static void main(String arg[]) {

//    Get Adjective
        System.out.println("Give me an adjective");
        Scanner scanner = new Scanner(System.in);
       String adj =  scanner.next();

//    Get Season
        System.out.println("Give me a Season of the year");
        String season = scanner.next();

//    Number of cups of coffee
        System.out.println("Give me a number");
        int cupNumber = scanner.nextInt();
        scanner.close();

//        Display result
        System.out.println("On a " + adj + " " + season + " day, I drink a minimum of " + cupNumber + " cups of coffee.");
    }
}
