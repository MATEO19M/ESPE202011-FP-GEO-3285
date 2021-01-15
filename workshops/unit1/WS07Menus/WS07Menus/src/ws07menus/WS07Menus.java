
package ws07menus;

import java.util.Scanner;


public class WS07Menus {

  
    public static void main(String[] args) {
                
         Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
            System.out.println(" ========= Economic capacity=======");
            System.out.println("1. -> income ");
            System.out.println("2. -> egress");
            System.out.println("3. -> buisnes");
            System.out.println("4. -> house expenses");
            System.out.println("5. -> Exit");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    int addend1;
                    int addend2;
                    int sum;
                    System.out.println("enter addend 1 -> ");
                    addend1 = input.nextInt();
                    System.out.println("enter addend 2 -> ");
                    addend2 = input.nextInt();
                    sum = addend1 + addend2;
                    System.out.println(" the sum is --> " + sum);
                                   
                case 2:
                     int difference;
                     int minuend;
                     int subtrahend;
                    System.out.println("enter minuend -> ");
                    minuend = input.nextInt();
                    System.out.println("enter subtrahend -> ");
                    subtrahend = input.nextInt();
                    difference = minuend - subtrahend;
                    System.out.println(" the difference is --> " + difference);
                    break;
                    
                case 3:
                    int multiply;
                    int multiplying;
                   int multiplier;
                   System.out.println("enter multiplying -> ");
                     multiplying = input.nextInt();
                    System.out.println("enter multiplier -> ");
                    multiplier = input.nextInt();
                   multiply = multiplying * multiplier;
                    System.out.println(" the multiply is --> " + multiply);
                    break;
                   
                case 4:
                     int division;
                      int dividend;
                     int divider;
                    System.out.println("enter dividend -> ");
                     dividend = input.nextInt();
                    System.out.println("enter  divider -> ");
                    divider = input.nextInt();
                  division = dividend / divider;
                    System.out.println(" the division is --> " + division);
                    break;
                case 5:
                    System.out.println("No funds my friend");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }

        } while (option != 5);

    }

}