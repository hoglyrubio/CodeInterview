package com.hogly;

import java.util.Arrays;

public class BasicLogic {

  /**
   * Return true if the parameter is equals to "Hello"
   */
  public static boolean isEqualsToHello(String value) {
    // Wrong. This is not the way to compare strings in Java
    // return value == "Hello";
    // Wrong. What if value is null? NullPointerException!
    // return value.equals("Hello");
    // This is the correct answer
    return "Hello".equals(value);
  }

  /**
   * Calculate the distance of the closest numbers in the array
   * Given [1,22,45,55,65] the expected result is 10
   */
  public static int distClosestNumbers(int... numbers) {
    int distance = Integer.MAX_VALUE;
    for (int x = 0; x < numbers.length; x++) {
      for (int y = x + 1; y < numbers.length; y++) {
        int candidate = Math.abs(numbers[x] - numbers[y]);
        if (distance > candidate) {
          distance = candidate;
        }
      }
    }
    return distance;
  }

  /**
   * Calculate the distance of the closest numbers in the array
   */
  public static int distClosestNumbersSorting(int... numbers) {
    if (numbers.length <= 1) {
      return 0;
    }
    int distance = Integer.MAX_VALUE;
    Arrays.sort(numbers);
    for (int i = 0; i < numbers.length - 1; i++) {
      int candidate = numbers[i + 1] - numbers[i];
      if (distance > candidate) {
        distance = candidate;
      }
    }
    return distance;
  }

}
