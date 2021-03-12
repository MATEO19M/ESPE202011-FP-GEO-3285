package taxdeclarations;

import java.util.Scanner;
import ec.edu.espe.tax.BasicTax;

public class TaxDeclaration {

    public static void main(String[] args) {
        float price;
        float ivaValue;
        float totalprice;
        final float ivaPercentage = 12;
        Scanner reader = new Scanner(System.in);
        System.out.println("Mateo Martinez Taxes");
        System.out.println("IVA");
        System.out.println("Enter the price of your products");
        price =reader.nextFloat();
        ivaValue=BasicTax.computeIva(price, ivaPercentage);
        totalprice=price+ivaValue;
        System.out.println("Total Price:"+totalprice);
        
          
    }

}
