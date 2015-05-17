package week1.day2;

import java.util.Scanner;

public class Task2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first value");
    int first = sc.nextInt();
    System.out.println("Enter second value");
    int second = sc.nextInt();

    if (first > 20 && second > 20) {
      System.out.println("Excellent");
    } else {
      System.out.println("Bad numbers");
    }
  }
}
