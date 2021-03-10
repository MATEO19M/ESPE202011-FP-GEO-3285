package rangesfunctions;

import java.util.Scanner;

public class RangesFunctions {

    public static void main(String[] args) {

        double kWhday = 1.5;

        System.out.println("Author: Mateo Martinez");
        Scanner reader = new Scanner(System.in);
        showmeTHEVALUE(reader, kWhday);
        showTHETIME(reader);
    }

    private static void showTHETIME(Scanner reader) {
        int rice;
        int soup;
        int juice;
        double lunchtime;
        System.out.println("how long does it take to cook the rice: ");
        rice = reader.nextInt();
        System.out.println("how long does it take to cook the soup: ");
        soup = reader.nextInt();
        System.out.println("how long does it take to make a juice: ");
        juice = reader.nextInt();
        lunchtime = rice + soup + juice;
        System.out.println("lunch is ready in: " + " = " + lunchtime + " minutes ");
    }

    private static void showmeTHEVALUE(Scanner reader, double kWhday) {
        int times;
        double result;
        double resultofthemonth;
        System.out.println("How many times do you cook a day?:");
        times = reader.nextInt();
        result = times * kWhday;
        System.out.println("your consumption per day is : " + times + " x " + kWhday + " = " + result);
        resultofthemonth = result * 30;
        System.out.println("your consumption per month is: " + " = " + resultofthemonth);
    }

}
