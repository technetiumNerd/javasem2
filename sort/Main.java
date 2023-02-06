package sort;

import java.util.Arrays;

public class Main {
  public static void main(String args[]) {
    int[] numbers = new int[] {2, 57, 4, 13, 8, 76, 34, 25};
    printArray(numbers);
    Arrays.sort(numbers);
    printArray(numbers);

    printSearchNumber(numbers, 2);
    printSearchNumber(numbers, 3);

    String[] strArr = { "stor", "vild", "Anders", "Benjamin" };
    printArray(strArr);
    Arrays.sort(strArr);
    printArray(strArr);
    printSearchString(strArr, "lille");
    printSearchString(strArr, "stor");
  }
  public static void printSearchString(String[] arr, String s) {
    if (Arrays.binarySearch(arr, s) > -1) System.out.println(String.format("String %s found", s));
    else System.out.println(String.format("String %s not found", s));
  }
  public static void printSearchNumber(int[] arr, int i) {
    if (Arrays.binarySearch(arr, i) > -1) System.out.println(String.format("Number %d found", i));
    else System.out.println(String.format("Number %d not found", i));
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