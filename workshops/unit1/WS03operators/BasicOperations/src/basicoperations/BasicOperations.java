
package basicoperations;


public class BasicOperations {

    
    public static void main(String[] args) {
        int sum;
        int addend1;
        int addend2;
        int difference;
        int minuend;
        int subtrahend;
        int multiply;
        int multiplying;
        int multiplier;
        int division;
        int dividend;
        int divider;
         int residue;
        int dividend1;
        int divider1;
         addend1 = 5;
          addend2 = 18;
          minuend = -23;
          subtrahend = -6;
         multiplying = 8;
         multiplier = 5;
         dividend = 25 ;
        divider = 5;
         dividend1 = 35;
         divider1 = 5;
                  
         sum = addend1 + addend2;
          System.out.println("The addition of "  + addend1 + "+" + addend2 + "is equal to --> " + sum);
        
        difference = minuend - subtrahend;
          System.out.println("The difference of "  + minuend + "+" + subtrahend + "is equal to --> " + difference);
        
        multiply = multiplying * multiplier;
          System.out.println("The multiply of "  + multiplying + "+" + multiplier + "is equal to --> " + multiply);
          
          division = dividend / divider;
          System.out.println("The division of "  + dividend+ "+" + divider + "is equal to --> " + division);
          
          residue = dividend1 % divider1;
          System.out.println("The residue of "  + dividend1+ "+" + divider1 + "is equal to --> " + residue);
          
    }
    
}
