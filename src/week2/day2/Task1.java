package week2.day2;

import java.util.Scanner;

public class Task1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter array size");
    int arraySize = scanner.nextInt();
    int[] numbers = new int[arraySize];
    for (int i = 0; i < numbers.length; i +=2){
      numbers[i] = (int) (Math.random() * 5);
    }

    for (int i = 0; i < numbers.length; i++){
      System.out.print(numbers[i] + " ");
    }
  }
}
