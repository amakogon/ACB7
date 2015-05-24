package week2.day1;

public class ArrayExample {
  public static void main(String[] args) {
    //data_type[] array_name = new data_type[size];
    int[] numbers = new int[4];
    System.out.println(numbers);
    System.out.println("Array 1");
    System.out.println(numbers[0]);
    System.out.println(numbers[1]);
    System.out.println(numbers[2]);
    System.out.println(numbers[3]);

    int[] mas = {1, 5, 2};
    System.out.println("Array 2");
    System.out.print(mas[0] + ", ");
    System.out.print(mas[1] + ", ");
    System.out.print(mas[2]);

    System.out.println("\nChanged array of numbers:");
    numbers[1] = 15;
    numbers[2] = 9;
    System.out.println(numbers[0]);
    System.out.println(numbers[1]);
    System.out.println(numbers[2]);
    System.out.println(numbers[3]);
  }
}
