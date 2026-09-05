import java.util.*;

class MatrixMismatchException extends Exception {
    MatrixMismatchException(String message) {
        super(message);
    }
}

public class Problem2_MatrixMultiplication {

    static int[][] multiplyMatrices(int[][] A, int[][] B)
            throws MatrixMismatchException {

        if (A[0].length != B.length) {
            throw new MatrixMismatchException("Matrix dimensions do not match");
        }

        int[][] result = new int[A.length][B[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < B.length; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter rows and columns of A: ");
            int r1 = sc.nextInt();
            int c1 = sc.nextInt();

            int[][] A = new int[r1][c1];

            System.out.println("Enter Matrix A:");
            for (int i = 0; i < r1; i++)
                for (int j = 0; j < c1; j++)
                    A[i][j] = sc.nextInt();

            System.out.print("Enter rows and columns of B: ");
            int r2 = sc.nextInt();
            int c2 = sc.nextInt();

            int[][] B = new int[r2][c2];

            System.out.println("Enter Matrix B:");
            for (int i = 0; i < r2; i++)
                for (int j = 0; j < c2; j++)
                    B[i][j] = sc.nextInt();

            int[][] result = multiplyMatrices(A, B);

            System.out.println("Result:");
            for (int[] row : result)
                System.out.println(Arrays.toString(row));

        } catch (MatrixMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}