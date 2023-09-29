import java.util.Scanner;

public class Selection3{
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        double operand1, operand2, results;
        char operator;
        System.out.println("Input operand 1: ");
        operand1 = input05.nextDouble();
        System.out.println("Input operand 2: ");
        operand2 = input05.nextDouble();
        System.out.println("Input operand (+ - * /): ");
        operator = input05.next().charAt(0);

        switch (operator) {
            case '+':
                results = operand1 + operand2;
                System.out.println(operand1 + " + " + operand2 + " = " + results);
            case '-':
                results = operand1 - operand2;
                System.out.println(operand1 + " - " + operand2 + " = " + results);
                break;
            case '*':
                results = operand1 * operand2;
                System.out.println(operand1 + " * " + operand2 + " = " + results);
                break;
            case '/':
                results = operand1 / operand2;
                System.out.println(operand1 + " / " + operand2 + " = " + results);
                break;
            default:
                System.out.println("Invalid opera");
        }
    }
}