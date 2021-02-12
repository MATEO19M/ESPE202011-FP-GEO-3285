package hw12taxes;

import java.util.Scanner;

public class HW12Taxes {

    public static void main(String[] args) {
        double base;
        double percentage;
        double total;
        double vat;
        System.out.println("========= Mateo Martinez Program =========");
        System.out.println("========= VAT CALCULATOR =========");
        Scanner read = new Scanner(System.in);
        HW12Taxes calculador = new HW12Taxes();
        System.out.println("Enter a base:");
        base = read.nextDouble();
        System.out.println("Enter the VAT percentage:");
        percentage = read.nextDouble();
        vat = calculador.computeTheVAT(base, percentage);
        total = base + vat;
        System.err.println("Base: " + "$" + base);
        System.err.println("VAT: " + "$" + vat);
        System.err.println("Total: " + "$" + total);
        
        System.out.println(" ========= Currency outflow Tax Calculator =======");
        System.out.println("  Enter The Value To Cancel Abroad : ");
        HW12Taxes obj01 = new HW12Taxes();
        Scanner read1 = new Scanner(System.in);
        double num;
        num = read1.nextDouble();
        obj01.computeCurrencyOutflow(5, num);

        System.out.println(" ========= Income Tax =========");
        double tax = 0, it;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter income ");
        it = sc.nextDouble();
        if (it <= 11.212) {
            tax = 0;
        } else if (it <= 14.285) {
            tax = 0.5 * (it - 14.285);
        } else if (it <= 17.854) {
            tax = (0.10 * (it - 17.854)) + (0.5 * 14.285);
        } else if (it <= 21.442) {
            tax = (0.12 * (it - 21.442)) + (0.10 * 17.854) + (0.5 * 14.285);
        } else if (it <= 42.874) {
            tax = (0.20 * (it - 42.874)) + (0.10 * 17.854) + (0.5 * 14.285) +(0.12 * 21.442);
        } else if (it <= 64.297) {
            tax = (0.25 * (it - 64.297)) + (0.10 * 17.854) + (0.5 * 14.285) +(0.12 * 21.442) +(0.20 * 42.874);
        } else if (it <= 85.729) {
            tax = (0.30 * (it - 85.729)) + (0.10 * 17.854) + (0.5 * 14.285) +(0.12 * 21.442) +(0.20 * 42.874) +(0.25 * 64.297) +(0.30 * 85.729);
        } else if (it <= 114.288) {
            tax = (0.35 * (it - 114.288)) + (0.10 * 17.854) + (0.5 * 14.285) +(0.12 * 21.442) +(0.20 * 42.874) +(0.25 * 64.297) +(0.30 * 85.729);
        } else {
            tax = (0.5 * (it - 1000000)) +(0.5 * 14.285)+(0.10 * 17.854) +(0.12 * 21.442) +(0.20 * 42.874) +(0.25 * 64.297) +(0.30 * 85.729) +(0.35 * 114.288);
        }
        System.out.println("Income tax amount is " + tax);
//        Scanner read2 = new Scanner(System.in);
//        float incomeTax=0.0F;
//        float overBasicTax =0.0F;
//        float Taxbase =0.0f;
//        float Annualdeducible =0.0F;
//        float total1 = 0.0F;     
//        float basicFraction =0.0F;
//        float Annualincome;
//        System.out.println("Enter Your Annual Salary");
//        Annualincome = read2.nextFloat();
//        System.out.println("Enter Your Annual Deducible");
//        Annualdeducible = read2.nextFloat();
//        total1= Taxbase(Annualincome,Annualdeducible);
//        System.out.println("Your Basic Fraction is : "+ total1);
//        System.out.println("Your Taxe Base is: "+ Taxbase);
//        basicFraction = computeBasicFraction(Taxbase(int)basicFraction);

    }

    public double computeTheVAT(double base, double percentage) {
        return base * percentage / 100;
    }

    public void computeCurrencyOutflow(double porcent, double cant) {
        double resultado;
        resultado = (porcent / 100) * cant;
        System.out.println("The " + porcent + "% of " + cant + " is: " + resultado);

    }
}
