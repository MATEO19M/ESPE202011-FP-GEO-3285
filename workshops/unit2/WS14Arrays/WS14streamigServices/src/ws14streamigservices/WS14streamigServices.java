
package ws14streamigservices;

import java.util.Scanner;

public class WS14streamigServices {

    
    public static void main(String[] args) {
          int[] streamigServices;
        String[] streamingServices = {"Netflix", "Disney", "Prime Video", "Hulu", "HBO"};
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the name of streamigServices -> ");
        n = input.nextInt();

        streamigServices = new int[n];
        //chickens = new String[20];
        //weightsByCoop = new float[n];

//        eggsByCoop[0] = 7;
//        eggsByCoop[1] = 9;
//        eggsByCoop[2] = 3;
//        eggsByCoop[3] = 9;
//        eggsByCoop[4] = 8;
        for (int i = 0; i < n; i++) {
            System.out.print("Streaming " + (i + 1) + " -> ");
            streamigServices[i] = input.nextInt();
        }

        for (int eggs : streamigServices) {
            System.out.println("egss of coop are " + eggs);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("stream " + (i + 1) + " -> " + streamigServices[i]);
        }

        for (String streaming : streamingServices) {
            System.out.println("streaming name -> " + streaming);
        }

    }

}

  
