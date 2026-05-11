import java.util.Scanner;

class MatrixMultiplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Matrix 1 dimensions
        System.out.print("Enter rows and columns of Matrix A: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        // Matrix 2 dimensions
        System.out.print("Enter rows and columns of Matrix B: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        // Check multiplication condition
        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible!");
            return;
        }

        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];
        int[][] C = new int[r1][c2];

        // Input Matrix A
        System.out.println("Enter Matrix A:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Input Matrix B
        System.out.println("Enter Matrix B:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Matrix Multiplication
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {

                C[i][j] = 0;

                for (int k = 0; k < c1; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Display Result
        System.out.println("Result Matrix:");

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}