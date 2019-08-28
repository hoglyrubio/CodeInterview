package com.hogly;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class BasicLogicTest {

  @Test
  public void test1() {
    int distance = BasicLogic.distClosestNumbers(1, 3, 5, 10, 45, -2);
    Assert.assertThat(distance, Matchers.equalTo(2));

    int distanceSorting = BasicLogic.distClosestNumbersSorting(1, 3, 5, 10, 45, -2);
    Assert.assertThat(distanceSorting, Matchers.equalTo(2));
  }

  @Test
  public void test2() {
    int distance = BasicLogic.distClosestNumbers();
    Assert.assertThat(distance, Matchers.equalTo(0));
  }

}
