package ec.edu.espe.Matrix;

public class MatrixOperations {

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

    public static float[][] subtractTwoMatrices(int m, int n, float[][] a, float[][] b) {
        float[][] c;
        c = new float[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] - b[i][j];
                System.out.println("\t");
            }
        }
        System.out.println("\t");
        return c;
    }

    public static void transpose(int n, int m, float[][] t, float[][] a) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                t[i][j] = a[j][i];
            }
        }
    }
    
}
