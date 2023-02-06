package sort;

import java.util.Arrays;

public class Main {
  public static void main(String args[]) {
    int[] numbers = new int[] {2, 57, 3, 13, 8, 76, 34, 25};
    printArray(numbers);
    int[] numcopy = numbers.clone();
    Arrays.sort(numcopy);
    printArray(numcopy);

    String[] strArr = { "stor", "vild", "Anders", "Benjamin" };
    printArray(strArr);
    Arrays.sort(strArr);
    printArray(strArr);
  }
  public static void printArray(int[] arr) {
    for (int i : arr) {
      System.out.print(String.format("[ %d ] ", i));
    } 
    System.out.println();
  }
  public static void printArray(String[] arr) {
    for (String s : arr) {
      System.out.print(String.format("[ %s ] ", s));
    } 
    System.out.println();
  }
}