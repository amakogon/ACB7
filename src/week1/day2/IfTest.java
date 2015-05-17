package week1.day2;

import java.util.Scanner;

public class IfTest {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter value");
    int value = keyboard.nextInt();

    if (value < 0) {
      System.out.println("You will loose your horse");
    } else if (value > 0) {
      System.out.println("You'll find a wife");
    } else if (value == 0) {
      System.out.println("Don not worry be happy");
    }

  }
}
