package hw08factorialnumber;

import java.util.Scanner;

public class HW08Factorialnumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        int factorial = 1;
        System.out.println("enter a number");
        num = input.nextInt();
        int num1 = num;
        while (num != 0) {
            factorial *= num;
            num--;

        } System.out.println("the factorial of : " + num1 + "is:" + factorial);
        while (num != 15);
    System.out.println("Good bye");
    }
    

   }
