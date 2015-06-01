package helper;

public class MatrixHelper {

  public static int[][] create(int rows, int columns) {
    int[][] matrix = new int[rows][columns];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        matrix[i][j] = (int) (Math.random() * 10);
      }
    }
    return matrix;
  }

  public static void print(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void swap(int[][] matrix, int i1, int j1, int i2, int j2) {
    int temp = matrix[i1][j1];
    matrix[i1][j1] = matrix[i2][j2];
    matrix[i2][j2] = temp;
  }

  public static void swapFirstAndLastRow(int[][] matrix) {
    swapRows(matrix, 0, matrix.length - 1);
  }

  public static void swapRows(int[][] matrix, int row1, int row2) {
    for (int i = 0; i < matrix[row1].length; i++) {
      swap(matrix, row1, i, row2, i);
    }
  }
}
