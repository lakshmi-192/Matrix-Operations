import java.util.*;

public class MatrixOperations {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of rows: ");
    int rows = sc.nextInt();
    System.out.print("Enter number of columns: ");
    int cols = sc.nextInt();
    int[][] matrix1 = new int[rows][cols];
    int[][] matrix2 = new int[rows][cols];
    System.out.println("Enter elements of Matrix 1:");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        matrix1[i][j] = sc.nextInt();
      }
    }
    System.out.println("Enter elements of Matrix 2:");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        matrix2[i][j] = sc.nextInt();
      }
    }
    System.out.println("Matrix 1:");
    printMatrix(matrix1);
    System.out.println("Matrix 2:");
    printMatrix(matrix2);
    System.out.println("Matrix Addition:");
    printMatrix(addMatrices(matrix1, matrix2));
    System.out.println("Matrix Subtraction:");
    printMatrix(subtractMatrices(matrix1, matrix2));
  }

  public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
    int rows = matrix1.length;
    int cols = matrix1[0].length;
    int[][] result = new int[rows][cols];

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        result[i][j] = matrix1[i][j] + matrix2[i][j];
      }
    }
    return result;
  }

  public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
    int rows = matrix1.length;
    int cols = matrix1[0].length;
    int[][] result = new int[rows][cols];

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        result[i][j] = matrix1[i][j] - matrix2[i][j];
      }
    }
    return result;
  }

  public static void printMatrix(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}
