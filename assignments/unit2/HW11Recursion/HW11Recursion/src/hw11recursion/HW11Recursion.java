package hw11recursion;

import java.util.Scanner;

public class HW11Recursion {

    public static void main(String[] args) {
        int number = 6;
        int fact = 0;
        fact = factorial(number);
        System.out.println("factorial of " + number + " is equal to -> " + fact);
        Scanner input = new Scanner(System.in);
        int base;
        int exponent;
       System.out.println("Enter a number");
       base = input.nextInt();
       System.out.println("Enter the exponent");
       exponent = input.nextInt();
       System.out.println("The potenciation is : -->" + showPotenciantion(base,exponent) );
    }

    public static int factorial(int n) {
        if (n < 0) {
            return -1;
        } else {
            if (n == 0) {
                return 1;
            } else {
                return (n * factorial(n - 1));

            }
        }
    }

    public static int showPotenciantion(int x, int n) {
        int aux;
        if (n == 0) {
            return 1;
        } else {
            aux = showPotenciantion(x, n / 2);
            if (n % 2 == 0) {
                return aux * aux;
            } else {
                return x * aux * aux;
            }
        }
    }

}
