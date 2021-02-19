package ws13task;

import java.util.Scanner;
import java.lang.Math;

public class WS13Task {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int opcion = 0;
        double acceleration;
        double mass;
        double force;
        double vo1;
        double ang;
        double total;

        do {
            System.out.println("========= Mateo Martinez Program =========");
            System.out.println();
            System.out.println(" ======== Select An Option ========= ");
            System.out.println(" ___________________________________ ");
            System.out.println(" ======== 1. Pentagon Area ========= ");
            System.out.println(" ======== 2. Rhomboid Area ========= ");
            System.out.println(" ======== 3. Trapeze Area ========= ");
            System.out.println(" ======== 4. Maximum height ========= ");
            System.out.println(" ======== 5. Displacement Formula ========= ");
            System.out.println(" ======== 6. Acceleration ========= ");
            System.out.println(" ======== 7. Exit ========= ");
            System.out.println(" ___________________________________ ");
            System.out.println(" Enter an option ");
            opcion = read.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Enter the perimeter");
                    float perimeter = read.nextInt();
                    System.out.println("Enter the Apothem");
                    float apothem = read.nextInt();
                    System.out.println(" THE PENTAGON AREA IS :" + computeThePentagonArea(perimeter, apothem));
                    break;
                case 2:
                    System.out.println("Enter base");
                    int base = read.nextInt();
                    System.out.println("Enter Height");
                    int height = read.nextInt();
                    System.out.println(" THE ROMBOID AREA IS :" + computeTheRhomboidArea(base, height));
                    break;
                case 3:
                    System.out.println("ENTER MAJOR BASE");
                    int base_ma = read.nextInt();
                    System.out.println("ENTER THE MINOR BASE");
                    int base_mi = read.nextInt();
                    System.out.println("Enter Height");
                    int height1 = read.nextInt();
                    System.out.println(" THE AREA OF THE TRAPEZE IS :" + computeTheTrapezeArea(base_ma, base_mi, height1));
                    break;
                case 4:
                    System.out.println("Calculate Maximum Hight");
                    System.out.println("Enter Initial Speed: ");
                    vo1 = read.nextFloat();
                    System.out.println("Enter the Angle: ");
                    ang = read.nextDouble();
                    total = (Math.pow((vo1 * Math.sin(ang)), 2)) / (2 * 9.8);
                    System.out.println("The Maximum Height is :" + total + "Mts");
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Displacement Formula");
                    System.out.println("Formula: x = vo*t + 1/2 a * t^2 ");
                    System.out.println("Enter vo");
                    double vo = read.nextDouble();
                    System.out.println("Enter t");
                    double t = read.nextDouble();
                    System.out.println("Enter a");
                    double a = read.nextDouble();
                    double result = ((vo * t) + (a / 2) * (t * t));
                    System.out.println(" ");
                    System.out.println("----- Answer ----");
                    System.out.println("x = " + vo + "*" + t + " + 1/2 *" + a + " * " + t + "^2");
                    System.out.println("x = " + result);
                    break;
                case 6:
                    System.out.println("Calculate Acceleration");
                    System.out.println("Enter Force");
                    force = read.nextFloat();
                    System.out.println("Enter Mass");
                    mass = read.nextFloat();
                    acceleration = force / mass;
                    System.out.println("Acceleration is :" + acceleration + "m/s^2");
                    break;

                case 7:
                    System.out.println("It's Friday See You Later");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option \n\n\n");
                    break;

            }

        } while (opcion != 0);

    }

    public static int computeThePentagonArea(float p, float a) {
        return (int) ((float)(p * a) / 2);
    }

    public static int computeTheTrapezeArea(int B, int b, int h) {
        return ((B + b) / 2) * h;
    }

    public static int computeTheRhomboidArea(int b, int h) {
        return b * h;
    }

}
