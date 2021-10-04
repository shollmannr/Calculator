package Calculator.java;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean inAction = true;

        while (inAction) {
            System.out.printf("Enter an operation: \n");

            System.out.println("1.) Add\n2.) Subtract\n3.) Multiply\n4.) Divide\n5.) Exit\n");

            String opp = scan.next();

            if (opp.toLowerCase().equals("exit")) {
                // Ends the app
                inAction = false;
                scan.close();
                break;
            }
            if (opp.toLowerCase().equals("add") || opp.toLowerCase().equals("subtract")
                    || opp.toLowerCase().equals("multiply") || opp.toLowerCase().equals("divide")
                    || opp.toLowerCase().equals("exit")) {
                System.out.print("Enter two numbers: ");

                int first = scan.nextInt();
                int second = scan.nextInt();

                int result = calculate(opp.toUpperCase(), first, second);

                System.out.println(
                        "The result is: " + result + " (" + opp.substring(0, 1).toUpperCase() + opp.substring(1) + ")");

                System.out.println("------------");
            } else {
                System.out.println("Invalid operation. Try again");
                continue;
            }
        }
    }

    public static int calculate(String operation, int num1, int num2) {
        int result = 0;

        switch (operation) {
            case "ADD":
                result = add(num1, num2);
                break;
            case "SUBTRACT":
                result = subtract(num1, num2);
                break;
            case "MULTIPLY":
                result = multiply(num1, num2);
                break;
            case "DIVIDE":
                result = divide(num1, num2);
                break;
            default:
                result = 0;
                break;
        }

        return result;
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

}