package week2.day1;

import java.util.Scanner;

public class Task1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("How many times?");
    int amount = sc.nextInt();

    for (int counter = 0; counter < amount; counter = counter + 1) {
      System.out.println("Hello world");
    }

  }
}
