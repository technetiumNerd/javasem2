package sort;

import java.util.Arrays;

public class Main {
  public static void main(String args[]) {
    //init array of numbers
    int[] numbers = new int[] {2, 57, 4, 13, 8, 76, 34, 25};
    //display numbers
    printArray(numbers);
    //sort array of numbers
    Arrays.sort(numbers);
    //display sorted array of numbers
    printArray(numbers);

    //print if number exists
    printSearchNumber(numbers, 2);
    printSearchNumber(numbers, 3);

    //init array of strings
    String[] strArr = { "stor", "vild", "Anders", "Benjamin" };
    //display strings
    printArray(strArr);
    //sort strings
    Arrays.sort(strArr);
    //display sorted array of strings
    printArray(strArr);
    //print if string exists
    printSearchString(strArr, "lille");
    printSearchString(strArr, "stor");
  }
  //methode for finding and displaying if number exists
  public static void printSearchNumber(int[] arr, int i) {
    //use Arrays.binarysearch
    if (Arrays.binarySearch(arr, i) > -1) System.out.println(String.format("Number %d found", i));
    else System.out.println(String.format("Number %d not found", i));
  }
  //method for printing int array
  public static void printArray(int[] arr) {
    for (int i : arr) {
      System.out.print(String.format("[ %d ] ", i));
    } 
    System.out.println();
  }
  //method for finding and displaying if string exists
  public static void printSearchString(String[] arr, String s) {
    //use Arrays.binarysearch
    if (Arrays.binarySearch(arr, s) > -1) System.out.println(String.format("String %s found", s));
    else System.out.println(String.format("String %s not found", s));
  }
  //method for printing string array
  public static void printArray(String[] arr) {
    for (String s : arr) {
      System.out.print(String.format("[ %s ] ", s));
    } 
    System.out.println();
  }
}