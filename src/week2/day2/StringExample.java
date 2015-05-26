package week2.day2;

public class StringExample {
  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = s1 + " world";
    System.out.println(s2);

    for (int i = 0; i < s2.length(); i++){
      System.out.print(s2.charAt(i));
    }
    System.out.println();
    if(s1.equals("Hello")) {
      System.out.println("Strings are equals");
    }
  }
}
