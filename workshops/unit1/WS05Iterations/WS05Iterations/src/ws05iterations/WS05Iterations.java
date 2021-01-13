
package ws05iterations;


public class WS05Iterations {

    
    public static void main(String[] args) {
  int i;
        i = 0;

        System.out.println("==== This is a while loop from 1 to 12 ====");

        while (i < 12) {
            System.out.println("i -> " + (i + 1));
            //i += 1;
            i++;
            //i = i + 1;
        }

        System.out.println("first 6 even numbers");
        i = 2;
        while (i <= 12) {
            System.out.println(i + " -> is even");
            i += 2;
        }

        System.out.println("First 22 odd numbers");
        
        int stop;
        stop=22;
        for(int j=1 ; j < stop ; j+=2){
            System.out.println("odd number -> " + j);
        }
        
        System.out.println("Multiplication Tables : 5 ");
        int top=13;
        int product;
        int table = 5;
        for (int j = 1 ; j <= top ; j++){
            product = table * j;
            System.out.println("5 * " + j + " = " + product);
        }
    }
}