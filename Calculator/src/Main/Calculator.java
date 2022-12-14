package Main;

import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {
        handleCalculation();
    }

    public static void handleCalculation() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter you first number");
        int number1 = sc.nextInt();
        System.out.println("Please enter you second number");
        int number2 = sc.nextInt();

        System.out.println("Please enter what you want the calculator");
        System.out.println(":1:Add, 2:Subtraction, 3:Multiplication, 4:Division,  5:Mod, 6:Sin, 7:Cos, 8:Tan, 9:Square, 10:ExponentialFunction");
        int start = sc.nextInt();

        switch (start) {
            case 1:
                double result = mathFunction(number1, number2, "+");
                System.out.println("Add " + result);
                break;
            case 2:
                double result2 = mathFunction(number1, number2, "-");
                System.out.println("Subtraction " + result2);
                break;
            case 3:
                double result3 = mathFunction(number1, number2, "*");
                System.out.println("Multiplication " + result3);
                break;
            case 4:
                double result4 = mathFunction(number1, number2, "/");
                System.out.println("Division " + result4);
                break;
            case 5:
                double result5 = mathFunction(number1, number2, "mod");
                System.out.println("Mod " + result5);
                break;
            case 6:
                double result6 = mathFunction(number1, number2, "sin");
                System.out.println("Sin " + result6);
                break;
            case 7:
                double result7 = mathFunction(number1, number2, "cos");
                System.out.println("Cos" + result7);
                break;
            case 8:
                double result8 = mathFunction(number1, number2, "tan");
                System.out.println("Tan" + result8);
                break;
            case 9:
                double result9 = mathFunction(number1, number2, "square");
                System.out.println("Square" + result9);
                break;
            case 10:
                double result10 = mathFunction(number1, number2, "ExponentialFunction");
                System.out.println("ExponentialFunction" + result10);
                break;
        }
    }

    public static double mathFunction(int number1, int number2, String operand) {

        double result = 0;

        switch (operand) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
            case "mod":
                result = Math.ceilMod(number1, number2);
                break;
            case "sin":
                result = Math.sin(number1);
                break;
            case "cos":
                result = Math.cos(number2);
                break;
            case "tan":
                result = Math.tan(number2);
                break;
            case "square":
                result = Math.sqrt(number1);
                break;

        }
        return result;

    }
}


