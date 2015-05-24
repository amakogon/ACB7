package week2.day1;

import java.util.Scanner;

public class Task2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array size");
    int arraySize = sc.nextInt();
    int[] nums = new int[arraySize];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = (int) (Math.random() * 20);
      System.out.print(nums[i] + " ");
    }
    System.out.println();
    for(int i = nums.length - 1; i > -1; i--){
      System.out.print(nums[i] + " ");
    }

  }
}
