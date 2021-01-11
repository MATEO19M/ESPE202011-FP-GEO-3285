
package ws04logicaloperators;


public class WS04Logicaloperators {

   
    public static void main(String[] args) {
        
        int x = 9;
        if (x != 9) {
            System.out.println("x is equals to 9");
        } else {
            System.out.println("x is NOT equal to 9");
        }

        boolean y = x != 9;
        System.out.println("x != 9 --> " + (y));
        System.out.println("x == 9 --> " + (x == 9));
        System.out.println("x = 8 -->   " + (x = 8));
        System.out.println("x > 8 -->  " + (x > 8));
        System.out.println("x >= 8 --> " + (x >= 8));

        boolean comparison = false;
        boolean comparison2 = false;
        boolean comparison3 = false;
        comparison = x != 9;
        System.out.println("comparison -> " + comparison);

        comparison2 = x >= 8;
        System.out.println(" logical AND (&&)");
        comparison3 = comparison && comparison2;
        System.out.println("comparison1 ^ comparison2 --> " + (comparison3));
        comparison3 = comparison || comparison2;
        System.out.println("comparison1 v comparison2 --> " + (comparison3));

        System.out.println("not comparison --> " + !comparison);
        comparison = false;
        System.out.println("not comparison --> " + !comparison);
        comparison = true;
        System.out.println("not comparison --> " + !comparison);
        System.out.println("comparison2 -> " + comparison2);

        System.out.println(" logical AND (&&)");
        comparison3 = comparison && comparison2;
        System.out.println("comparison1 ^ comparison2 --> " + (comparison3));
        comparison3 = comparison || comparison2;
        System.out.println("comparison1 v comparison2 --> " + (comparison3));

        System.out.println("not comparison --> " + !comparison);
        comparison = false;
        System.out.println("not comparison --> " + !comparison);
        comparison = true;
        System.out.println("not comparison --> " + !comparison);
        
        
        System.out.println("Mateo Martinez OR TRUTH TABLE even numbers ->||");
        System.out.println("=================================================");
        boolean p;
        boolean q;

        p = true;
        q = true;
           System.out.println(" ( " + p + "  v " + q + " ) " + (p || q));
               p = true;
               q = false;
                  System.out.println(" ( " + p + "  v " + q + " ) " + (p || q));
                     p = false;
                     q = true;
                         System.out.println(" ( " + p + "  v " + q + " ) " + (p || q));
                              p = false;
                             q = false;
                                 System.out.println(" ( " + p + "  v " + q + " ) " + (p || q));
    } 
    
}
