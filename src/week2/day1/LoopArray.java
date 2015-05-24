package week2.day1;

public class LoopArray {
  public static void main(String[] args) {
    int[] numbers = new int[5];
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
    System.out.println();
    int rand = (int) (Math.random() * 10);
    System.out.println("Rand = " + rand);

  }
}
