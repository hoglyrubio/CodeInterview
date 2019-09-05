package com.hogly;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

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
   * Given a positive integer number, calculate a new number reversing their digits
   *
   * @param number
   * @return
   */
  public static int reverseNumber(int number) {
    int reverse = 0;
    while (number > 0) {
      int remainder = number % 10;
      reverse = reverse * 10 + remainder;
      number = number / 10;
    }
    return reverse;
  }

  /**
   * Given an array, find the int that appears an odd number of times.
   * There will always be only one integer that appears an odd number of times.
   */
  public static int findOddTimes(int[] values) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int value : values) {
      map.put(value, map.getOrDefault(value, 0) + 1);
    }
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() % 2 != 0) {
        return entry.getKey();
      }
    }
    return 0;
  }

  public static int findOddTimesJava8(int[] values) {
    return Arrays.stream(values).boxed()
      .collect(Collectors.groupingBy(Function.identity()))
      .entrySet().stream()
      .filter(entry -> entry.getValue().size() % 2 != 0)
      .findFirst()
      .map(entry -> entry.getKey())
      .orElse(0);
  }

}
