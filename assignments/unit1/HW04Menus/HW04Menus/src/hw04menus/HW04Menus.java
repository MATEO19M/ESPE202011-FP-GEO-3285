
package hw04menus;

import java.util.Scanner;


public class HW04Menus {

    
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        int option;

        do {
            System.out.println(" ========= Mathematical Operations =======");
            System.out.println("1. -> residue ");
            System.out.println("2. -> power");
            System.out.println("3. -> square root");
            System.out.println("4. -> Cube root");
            System.out.println("5. -> Exit");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    int dividend;
                    int divider ;
                    int residue;
                    System.out.println("enter dividend -> ");
                    dividend = input.nextInt();
                    System.out.println("enter divider -> ");
                    divider = input.nextInt();
                    residue = dividend % divider;
                    System.out.println(" the residue is --> " + residue);
                    break;
                                   
                case 2:            

                  System.out.print("Enter the number to square : ");
                   int n1 = input.nextInt();
                 int Result = n1 * n1;
                   System.out.print( n1 + " quadratic powers : "  + Result);
                    break;
                    
                case 3:
                    System.out.println("square root of a number");
                     int n2 = input.nextInt();
                         double result = Math.sqrt(n2);
                           System.out.println("The square root of " + n2 + " is " + result);
                    break;
                   
                case 4:
                    System.out.println("Cube root of a number");
                     double n3 = input.nextInt();
                       double Result1 = Math.cbrt (n3) ;
                        System.out.printf("Cube root of %.2f es %.2f\n", n3 , Result1);
                    break;
                case 5:
                    System.out.println("Good bye my friend");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }

        } while (option != 5);

    }

}
        
        
        
        
        
    
    

