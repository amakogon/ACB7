package week2.day2;

public class MethodExample {
  public static void main(String[] args) {
    int result = sum(5, 2);
    System.out.println(result);
    System.out.println(sum(3, 7));
    System.out.println(sum(3, 6));

    int[] mas = {1, 4, 2};
    int[] mas1 = {6, 18, 20, 123, 6, 3, 2};
    print(mas);
    print(mas1);
  }

  public static int sum(int a, int b) {
    int res = a + b;
    return res;
  }

  public static void print(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }
}
