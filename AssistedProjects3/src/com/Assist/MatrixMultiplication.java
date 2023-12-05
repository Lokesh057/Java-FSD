package com.Assist;
import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the first matrix: ");
        int rowsA = scanner.nextInt();

        System.out.print("Enter the number of columns for the first matrix: ");
        int colsA = scanner.nextInt();

        System.out.print("Enter the number of rows for the second matrix: ");
        int rowsB = scanner.nextInt();

        System.out.print("Enter the number of columns for the second matrix: ");
        int colsB = scanner.nextInt();

        // Check if matrices can be multiplied
        if (colsA != rowsB) {
            System.out.println("Matrices cannot be multiplied. Number of columns in the first matrix must be equal to the number of rows in the second matrix.");
            return;
        }

        int[][] matrixA = new int[rowsA][colsA];
        int[][] matrixB = new int[rowsB][colsB];

        System.out.println("Enter the elements of the first matrix:");
        readMatrix(matrixA, scanner);

        System.out.println("Enter the elements of the second matrix:");
        readMatrix(matrixB, scanner);

        int[][] resultMatrix = multiplyMatrices(matrixA, matrixB);

        System.out.println("Resultant Matrix (Product of the two matrices):");
        printMatrix(resultMatrix);

        scanner.close();
    }

    private static void readMatrix(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("Element at position (" + (i + 1) + ", " + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    private static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;

        int[][] resultMatrix = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return resultMatrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
