package Practices_Codes;

import java.util.Scanner;

public class Java_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        System.out.println("Enter operation (Sum/Sub/Mul):");
        String operator = sc.next();

        if (operator.equalsIgnoreCase("Sum")) {
            System.out.println("Sum = " + (a + b));

        } else if (operator.equalsIgnoreCase("Sub")) {
            System.out.println("Subtraction = " + (a - b));

        } else if (operator.equalsIgnoreCase("Mul")) {
            System.out.println("Multiplication = " + (a * b));

        } else {
            System.out.println("Invalid operation!");
        }

        sc.close();
    }
}