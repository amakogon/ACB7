package helper;

public class ArrayHelper {
  public static void print(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }

  public static int[] generate(int size) {
    int[] array = new int[size];
    for (int i = 0; i < array.length; i++) {
      array[i] = (int) (Math.random() * 10);
    }
    return array;
  }

  public static void bubbleSort(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = 0; j < array.length - 1 - i; j++){
        if(array[j] > array[j + 1]){
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
  }
}
