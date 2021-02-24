package hw15matrixoperation;

import java.util.Scanner;

public class HW15MatrixOperation {

    public static void main(String[] args) {
        int MatrixA[][];
        int MatrixB[][];
        int MatrixC[][];
        int m;
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matrix A Data :");
        System.out.println("Enter a row number");
        m = scanner.nextInt();
        System.out.println("Enter a column number");
        n = scanner.nextInt();
        MatrixA = new int[m][n];
        for (int i=0; i<=m; i++){
             for (int j=0; j<=n; j++){
                 System.out.print("Escribir valor " + i + " , " + j + " : ");

                MatrixA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matrix B Data :");
        System.out.println("Enter a row number");
        m = scanner.nextInt();
        System.out.println("Enter a column number");
        n = scanner.nextInt();
        MatrixB = new int[m][n];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print("Escribir valor " + i + " , " + j + " : ");

                MatrixB[i][j] = scanner.nextInt();
            }
        }
        MatrixC = new int[m][n];
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                MatrixC[i][j] = MatrixA[i][j] + MatrixB[i][j];
            }
        }

        System.out.println("Matrix resultante de la suma :");
        MatrixC = new int[m][n];
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.println(MatrixC[i][j] + " ");
            }
            System.out.println("");

        }
    }
}
