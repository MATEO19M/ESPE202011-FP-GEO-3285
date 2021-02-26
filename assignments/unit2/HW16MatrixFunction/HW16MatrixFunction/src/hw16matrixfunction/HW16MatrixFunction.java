package hw16matrixfunction;

import java.util.Scanner;

public class HW16MatrixFunction {

    public static void main(String[] args) {
        float[][] a;
        float[][] b;
        float[][] c;
        int m = 0;
        int n = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the matrix dimesions");
        System.out.println("\n m->");
        m = input.nextInt();

        System.out.println("\n n->");
        n = input.nextInt();

        a = new float[m][n];
        b = new float[m][n];
        c = new float[m][n];

        System.out.println("------Enter the elements of the matrix-------");

        a = readMatrixElements(m, n, "A", input);
        b = readMatrixElements(m, n, "A", input);

        for (int tab = 0; tab <= n / 2; tab++) {
            System.out.println("\t");
        }
        System.out.println(" A");

        PrintTheMatrix(m, n, a);
        System.out.println("");

        System.out.println(" B ");
        PrintTheMatrix(m, n, b);

        System.out.println("--The sum of matrices is--");
        c = addTwoMatrices(m, n, a, b);
        PrintTheMatrix(m, n, c);
        
    }

    public static float[][] readMatrixElements(int m, int n, String matrixName, Scanner input) {
        float[][] matrix;
        matrix = new float[m][n];
        System.out.println("\t");
        for (int i = 0; i < m; i++) {
            System.out.println("--Row Numbers" + (i + 1) + "--");
            System.out.println("\t");
            for (int j = 0; j < n; j++) {
                System.out.print("\t " + matrixName + "[" + (i + 1) + "][" + (j + 1) + "] ->");
                System.out.println("\t");
                matrix[i][j] = input.nextFloat();
                System.out.println("\t");
            }
        }
        return matrix;
    }

    public static float[][] addTwoMatrices(int m, int n, float[][] a, float[][] b) {
        float[][] c;
        c = new float[m][n];
        System.out.println("\t");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.println("\t");
            }
        }
        System.out.println("\t");
        return c;

    }

    public static void PrintTheMatrix(int m, int n, float[][] matrix) {
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    if (i == 0) {
                        System.out.println("\t");
                    } else if (i == m - 1) {
                        System.out.println("\t");

                    } else {
                        System.out.println("\t");
                    }
                }
                System.out.println(matrix[i][j]);
                if (j > -1 && j < (n - 1)) {
                    System.out.println("\t");
                }
                if (j == (n - 1)) {
                    if (i == 0) {
                        System.out.println("\t");
                    } else if (i == m - 1) {
                        System.out.println("\t");

                    } else {
                        System.out.println("\t");
                    }
                }
            }
        }
        System.out.println("");
    }

    public static void printMatrix(int m, int n, float[][] matrix) {
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    if (i == 0) {
                        System.out.println("\t");
                    } else if (i == m - 1) {
                        System.out.println("\t");

                    } else {
                        System.out.println("\t");
                    }
                }
                System.out.println(matrix[i][j]);
                if (j > -1 && j < (n - 1)) {
                    System.out.println("\t");
                }
                if (j == (n - 1)) {
                    if (i == 0) {
                        System.out.println("\t");
                    } else if (i == m - 1) {
                        System.out.println("\t");

                    } else {
                        System.out.println("\t");
                    }
                }
            }

            System.out.println("");
        }
    }
}
