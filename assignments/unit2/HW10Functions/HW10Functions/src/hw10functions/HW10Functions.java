package hw10functions;

import java.util.Scanner;

public class HW10Functions {

    public static void main(String[] args) {
        float operand1 = 0;
        float operand2 = 0;
        float result = 0;
        Scanner reader;
        reader = new Scanner(System.in);
        System.out.println("---Enter Operand1---");
        operand1 = reader.nextFloat();
        System.out.println("---Enter Operand2---");
        operand2 = reader.nextFloat();
        result = operand1 / operand2;
        System.out.println("---The Result is: ---" + operand1 + "/" + operand2 + "-" + result);
        Scanner Sca = new Scanner(System.in);
        System.out.println("------Program that calculates  the square of a number\n\n---");
        System.out.println("---Enter number to square: ---");
        int number1 = Sca.nextInt();
        int result1 = number1 * number1;
        System.out.println("---The square is: ---" + result1);

        int multiplicand = 0;
        int multiplier = 1;
        int product;
        int stop = 12;

        product = 0;

        do {
            System.out.println("Enter the table you want to study ");
            System.out.println("0 (zero) to exit  --> ");

            Scanner input = new Scanner(System.in);
            multiplicand = input.nextInt();

            if (multiplicand != 0) {
                System.out.println("Studying the Table of ----> " + multiplicand + " <----");
                for (multiplier = 1; multiplier <= stop; multiplier++) {
                    product = multiplicand * multiplier;
                    System.out.println(multiplicand + " x " + multiplier + " = " + product);
                }
            }
            multiplier = 1;

        } while (multiplicand != 0);

        System.out.println("Mateo Martinez");
        System.out.println("Good Night");
    }
}
