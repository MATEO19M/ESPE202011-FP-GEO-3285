package hw14arrays;

import java.util.Scanner;

public class HW14Arrays {

    public static void main(String[] args) {

         int[] streamigServices;
        
                 
        String[] streamingServices = {"Netflix", "Disney", "Prime Video", "Hulu", "HBO"};
        String[] mobilesBrands = {"Xiaomi", "Apple", "Samsung", "Sony", "Oppo"};
        String[] televisionBrands = {"LG", "Sony", "Samsung", "Tcl", "Panasonic"};
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the name of streamigServices -> ");
        System.out.println("Enter the name of mobilesBrands -> ");
        System.out.println("Enter the name of telivisionBrands -> ");
        n = input.nextInt();
        streamigServices = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Streaming " + (i + 1) + " -> ");
            streamigServices[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print("Mobile " + (i + 1) + " -> ");
            streamigServices[i] = input.nextInt(); }
        for (int i = 0; i < n; i++) {
            System.out.print("Television " + (i + 1) + " -> ");
            streamigServices[i] = input.nextInt(); }

         for (int i = 0; i < n; i++) {
            System.out.println("stream " + (i + 1) + " -> " + streamigServices[i]);
        }
         for (int i = 0; i < n; i++) {
            System.out.println("televisionvrands " + (i + 1) + " -> " + streamigServices[i]);
            }
         for (int i = 0; i < n; i++) {
            System.out.println("mobilesBrands " + (i + 1) + " -> " + streamigServices[i]);
            }
         

        for (String streaming : streamingServices) {
            System.out.println("streaming name -> " + streaming);
        }
        for (String mobiles : mobilesBrands) {
            System.out.println("brand name -> " + mobiles);
        }for (String telivisionBrands : televisionBrands) {
            System.out.println("tvBrand name -> " + telivisionBrands);
        }

    }

}


