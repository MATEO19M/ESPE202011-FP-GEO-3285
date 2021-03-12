package modularcalculator;

import java.util.Scanner;
import utils.BasicOperaction;

public class ModularCalculator {

    public static void main(String[] args) {
        float operand1;
        float operand2;
        float result;
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter Two Number");
        operand1 = reader.nextFloat();
        operand2 = reader.nextFloat();
        System.out.println("Addition");
        result = BasicOperaction.addTwoNumbers(operand1, operand2);
        System.out.println("The sum is:" + result);
        System.out.println("Substraction");
        result = BasicOperaction.subtractTwoNumbers(operand1, operand2);
        System.out.println("the subtraction is:"+ result);
        System.out.println("Multiplication");
        result = BasicOperaction.multiplyTwoNumbers(operand1, operand2);
        System.out.println("the Multiplication is:"+ result);
        System.out.println("Division");
        result = BasicOperaction.divideTwoNumbers(operand1, operand2);
        System.out.println("the Division is:"+ result);
        
        
        
    }

}
