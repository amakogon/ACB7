package week3.day2;

import helper.MatrixHelper;

public class CreateMatrix {
  public static void main(String[] args) {
    int[][] array = MatrixHelper.create(4, 3);
    MatrixHelper.print(array);
    MatrixHelper.swapRows(array, 1, 3);
    System.out.println("~~~~~~~~After swap~~~~~~~~");
    MatrixHelper.print(array);

//    MatrixHelper.print(MatrixHelper.create(3,3));


  }
}
