package hw18searching;

import java.util.Scanner;

public class HW18Searching {

    public static void main(String[] args) {
        int x;
        int num[] = {12, 23, 34, 98, 87, 65, 0, 8, 9, 10};
        boolean theNumberThis = false;

        Scanner reader = new Scanner(System.in);
        System.out.print("Program that checks the number within the array \n \n");

        System.out.println("enter the number:");

        int number;
        number = reader.nextInt();

        for (x = 0; x < num.length; x++) {
            if (number == num[x]) {
                System.out.println("The number is in the index " + x + ", in position " + (x + 1));
                theNumberThis = true;
            }
        }

        if (theNumberThis == false) {
            System.out.println("The number is not : -1");

        }

    }
}
