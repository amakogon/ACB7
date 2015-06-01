package week3.day2;

import java.util.Scanner;

public class ScanText {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter text");
    String s = scanner.nextLine();

    int counter = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'a') {
        counter++;
      }
    }
    System.out.println("Count of a = " + counter);

    String[] names = {"Artem", "Igor", "Oleksandr"};

    String longestName = names[0];
    for(int i = 0; i < names.length; i++){
      if(longestName.length() < names[i].length()){
        longestName = names[i];
      }
    }
    System.out.println(longestName);
  }
}
