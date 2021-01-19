
package martinezmateoq11;

import java.util.Scanner;


public class MartinezMateoQ11 {


    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
        int option;

        do {
            System.out.println(" ========= Mathematical Operations =======");
            System.out.println("1. -> Table 1 ");
           
         
            System.out.println("13. -> Exit");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

                case 1:
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
        
    }
    while (option != 2);
}
