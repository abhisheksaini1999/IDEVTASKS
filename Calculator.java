package InternDEV;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to the Calculator");
        System.out.println("Available operations: +, -, *, /");
        
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Enter the operation (+, -, *, /): ");
        String operator = sc.next();
        
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();
        
        double result = 0.0;


        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operation entered.");
        }
        
        System.out.println("Result: " + result);
    }
}