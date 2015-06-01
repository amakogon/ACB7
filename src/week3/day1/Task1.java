package week3.day1;

import helper.ArrayHelper;

public class Task1 {
  public static void main(String[] args) {
    int[] nums = ArrayHelper.generate(5);
    ArrayHelper.print(nums);
    //sort
    ArrayHelper.bubbleSort(nums);
    ArrayHelper.print(nums);

  }
}
