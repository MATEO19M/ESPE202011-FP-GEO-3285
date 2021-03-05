package ochoaeq1inspection;

import java.util.Scanner;

public class OchoaEQ1Inspection {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalOfNumbers = 5;
        int result;
        int[] elements;
        elements = new int[totalOfNumbers];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the numbers of sum -->");
            elements[i] = input.nextInt();
            result = elements[0] + elements[1] + elements[2] + elements[3] + elements[4];
            System.out.println("the sum is " + result);

        }

        int totalOfNumbersPromedium = 3;
        float[] numbersThatPromedium;
        numbersThatPromedium = new float[totalOfNumbersPromedium];
        for (int j = 0; j < totalOfNumbersPromedium; j++) {
            System.out.println("Enter the numbers of promedium -->");
            numbersThatPromedium[j] = input.nextFloat();
            result = (int) ((numbersThatPromedium[0] + numbersThatPromedium[1] + numbersThatPromedium[2]) / 3);
            System.out.print("the promedium is ->" + result);

        }

    }

    public static float[] printSumElements(int totalOfNumbers, int[] elements, Scanner input) {
        totalOfNumbers = 5;
        elements = new int[totalOfNumbers];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the numbers of sum -->");
            elements[i] = input.nextInt();
        }

        return elements;
    }

    public static float[] calculateSumElements(int totalOfNumbers, int[] elements, Scanner input, int result) {
        result = elements[0] + elements[1] + elements[2] + elements[3] + elements[4];
        System.out.println("the sum is " + result);
        return result;
    }

}
