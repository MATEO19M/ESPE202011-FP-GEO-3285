
package hw02ranges.of.numeric.primitives;

import java.util.Scanner;


public class HW02RangesOfNumericPrimitives {

   
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
       System.out.println("Please enter a High1-->");
       float High1 = scn.nextFloat();
       System.out.println("Please enter a Long1-->");
       float Long1 = scn.nextFloat();
        System.out.println("Please enter a Width1-->");
      float Width1 = scn.nextFloat();
      float capacity = High1 * Long1 * Width1 ;
             System.out.println(" capacity: "   + capacity) ;
                                      
                  System.out.println("Please enter a High2-->");
       int High2 = scn.nextInt();
       System.out.println("Please enter a Long2-->");
       int Long2 = scn.nextInt();
        System.out.println("Please enter a Width2-->");
      int Width2 = scn.nextInt();
      int capacity = High2 * Long2 * Width2 ;
             System.out.println(" capacity: "   + capacity) ;
                                       
             System.out.println("Please enter a High3-->");
       short High3 = scn.nextShort();
       System.out.println("Please enter a Long3-->");
       short Long3 = scn.nextShort();
        System.out.println("Please enter a Width3-->");
      short Width3 = scn.nextShort();
      short capacity = (short) (High3 * Long3 * Width3) ;
             System.out.println(" capacity: "   + capacity) ;
}
}