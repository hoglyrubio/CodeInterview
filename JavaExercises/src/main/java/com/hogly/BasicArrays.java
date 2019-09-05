package com.hogly;

import java.util.Arrays;

public class BasicArrays {
  /**
   * Calculate the distance of the closest numbers in the array
   * Given [1,22,45,55,65] the expected result is 10
   */
  public static int distClosestNumbers(int... numbers) {
    if (numbers.length <= 1) {
      return 0;
    }
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

  public static int[] bubbleSort(int... elements) {
    for(int i = 0; i < elements.length; i++) {
      for (int j = i + 1; j < elements.length; j++) {
        if (elements[i] >= elements[j]) {
          int aux = elements[i];
          elements[i] = elements[j];
          elements[j] = aux;
        }
      }
    }
    return elements;
  }
}
