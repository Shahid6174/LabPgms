import java.util.*;

class Matrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m, n, p, q, i, j;
        m = Integer.parseInt(args[0]);
        n = Integer.parseInt(args[1]);
        p = Integer.parseInt(args[2]);
        q = Integer.parseInt(args[3]);
        int[][] a = new int[m][n];
        int[][] b = new int[p][q];
        int[][] c = new int[m][q]; // Rectified: Resultant matrix size m x q
        if (n != p) { // Rectified: Check condition for matrix addition
            System.out.println("Matrix addition is not possible");
            System.exit(0);
        }
        System.out.println("Enter matrix 1 elements");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++)
                a[i][j] = s.nextInt();
        }
        System.out.println("Enter matrix 2 elements");
        for (i = 0; i < p; i++) {
            for (j = 0; j < q; j++)
                b[i][j] = s.nextInt();
        }
        // Rectified: Loop for adding matrices
        for (i = 0; i < m; i++) {
            for (j = 0; j < q; j++) {
                c[i][j] = 0;
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("The matrix after addition is");
        for (i = 0; i < m; i++) {
            for (j = 0; j < q; j++)
                System.out.print(c[i][j] + " ");
            System.out.println();
        }
    }
}
