package week1.day2;

import java.util.Scanner;

public class Task1 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter first value");
    int firstValue = keyboard.nextInt();
    System.out.println("Enter second value");
    int secValue = keyboard.nextInt();

    int sum = firstValue + secValue;
    System.out.println("Sum = " + sum);

    int minus = firstValue - secValue;
    System.out.println("Minus = " + minus);

    double delResult = firstValue * 1.0 / secValue;
    System.out.println("Del = " + delResult);

    int multiplication = firstValue * secValue;
    System.out.println("Mult = " + multiplication);

  }
}
