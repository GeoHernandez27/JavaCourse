package chapter3;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String args[]) {
        System.out.println("Enter your letter grade: ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next().toUpperCase();

        String message;

        switch (grade){
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job";
                break;
            case "D":
                message = "Needs work";
                break;
            case "F":
                message = "See me...";
                break;
            default:
                message = "Error! Invalid grade.";
                break;
        }

        System.out.println(message);
    }
}
