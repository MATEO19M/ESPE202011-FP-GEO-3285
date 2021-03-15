package hw17matrixlibraries;

import ec.edu.espe.Matrix.MatrixOperations;
import java.util.Scanner;

public class HW17MatrixLibrarie {

    public static void main(String[] args) {
        float[][] a;
        float[][] b;
        float[][] t;
        float[][] c;
        int m = 0;
        int n = 0;
        int add;
        int substraction;
        int transpose;
        Scanner reader = new Scanner(System.in);
        System.out.println("Mateo Martinez Code");
        System.out.println("Enter the matrix dimesions");
        System.out.println("\n m->");
        m = reader.nextInt();
        System.out.println("\n n->");
        n = reader.nextInt();
        a = new float[m][n];
        b = new float[m][n];
        c = new float[m][n];
        t = new float[n][m];
        System.out.println("------Enter the elements of the matrix-------");
        a = readMatrixElements(m, n, "A", reader);
        b = readMatrixElements(m, n, "A", reader);
        add = MatrixOperations.addTwoMatrices(float[][] a, float[][] b);
        System.out.println("The add is :"+add);
        substraction = MatrixOperations.subtractTwoMatrices(int m, int n, float[][] a, float[][] b);
        System.out.println("The substract is:"+substraction);
        transpose = MatrixOperations.transpose(int n, int m, int c,int a);
        System.out.println("The transpose is:"+transpose);

    }

    public static float[][] readMatrixElements(int m, int n, String matrixName, Scanner input) {
        float[][] matrix;
        matrix = new float[m][n];
        for (int i = 0; i < m; i++) {
            System.out.println("--Row Numbers" + (i + 1) + "--");
            for (int j = 0; j < n; j++) {
                System.out.print(matrixName + "[" + (i + 1) + "][" + (j + 1) + "] ->");
                matrix[i][j] = input.nextFloat();
            }
        }
        return matrix;
    }

}
