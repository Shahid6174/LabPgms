import java.util.*;
class Matrix
{
    public static void main(String[] args) {
        
        if(args.length != 2)
        {
            System.out.println("Please provide with two matrices sizes as Command-Line arguments...");
            return;
        }
        int rows = Integer.parseInt(args[0]);
        int columns = Integer.parseInt(args[1]);
        if(rows<=0||columns<=0)
        {
            System.out.println("The sizes of matrix should be positive...");
            return;
        }
        int[][] matrixA = new int[rows][columns];
        int[][] matrixB = new int[rows][columns];

        intitialize_matrix(matrixA);
        intitialize_matrix(matrixB);
        int[][] resultMatrix = addMatrices(matrixA, matrixB);
        System.out.println("Matrix A: ");
        print_Matrix(matrixA);
        System.out.println("Matrix B: ");
        print_Matrix(matrixB);
        System.out.println("Resultant matrix: ");
        print_Matrix(resultMatrix);
    }
    private static void intitialize_matrix(int[][] matrix)
        {
            int value = 0;
            for(int i = 0; i<matrix.length; i++)
            {
                for(int j = 0; j < matrix[i].length; j++)
                {
                    matrix[i][j] = value++;
                }
            }
        }
        private static int[][] addMatrices(int[][] matrixA, int[][] matrixB)
        {
            int rows = matrixA.length;
            int columns = matrixA[0].length;
            int[][] resultMatrix = new int[rows][columns];
            for(int i = 0; i<rows; i++)
            {
                for(int j = 0; j<columns; j++)
                {
                    resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
                }
            }
            return resultMatrix;
        }
        private static void print_Matrix(int[][] matrix)
        {
            for(int[] row: matrix)
            {
                for(int value: row)
                {
                    System.out.println(value + " ");
                }
            }
            System.out.println();
        }
}