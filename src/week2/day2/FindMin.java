package week2.day2;

public class FindMin {
  public static void main(String[] args) {
    int[] mas = {5, -10, 3, 2, 8};
    int min = mas[0];
    for (int i = 1; i < mas.length; i++) {
      if(mas[i] < min) {
        min = mas[i];
      }
    }
    System.out.println("Min = " + min);
  }
}
