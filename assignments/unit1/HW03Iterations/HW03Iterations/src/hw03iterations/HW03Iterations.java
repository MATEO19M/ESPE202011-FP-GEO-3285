
package hw03iterations;


public class HW03Iterations {
  
    public static void main(String[] args) {
        
       int i;
        i = 0;

        System.out.println("==== This is a while loop from 1 to 28 ====");

        while (i < 28) {
            System.out.println("i -> " + (i + 1));
                     i++;
       } 
       System.out.println("Multiplication Tables : 28 ");
        int top=28;
        int product;
        int table = 28;
        for (int j = 1 ; j <= top ; j++){
            product = table * j;
            System.out.println("28 * " + j + " = " + product); 
    }    
       System.out.println("Shift of from a store");
       int stop;
        stop=28;
        for(int j=1 ; j <= stop ; j++){
            System.out.println("Turn --> " + j);  
      
    }
    
}
}
