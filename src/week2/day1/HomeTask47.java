package week2.day1;

import java.util.Scanner;

public class HomeTask47 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter first value");
    int first = keyboard.nextInt();
    System.out.println("Enter second value");
    int second = keyboard.nextInt();

    int integer = first/second;
    int mod = first%second;

 //   boolean result = mod == 0;

    System.out.println("Integer part = " + integer + ", mod = " + mod
                         + ", " + (mod == 0));

  }
}
