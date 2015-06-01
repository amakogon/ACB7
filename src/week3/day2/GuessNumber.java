package week3.day2;

import java.util.Scanner;

public class GuessNumber {
  public static void main(String[] args) {
    int random = (int) (Math.random() * 10);

    Scanner scanner = new Scanner(System.in);
    int inputNumber;
    int counter = 0;
    do {
      counter++;
      System.out.println("Enter number");
      inputNumber = scanner.nextInt();

      if (random == inputNumber) {
        System.out.println("Congrats");
      } else if (inputNumber < random) {
        System.out.println("more");
      } else if (inputNumber > random) {
        System.out.println("less");
      }
    } while (random != inputNumber && counter < 3);
  }
}
