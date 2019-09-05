package com.hogly;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;

public class BasicArraysTest {

  @Test
  public void testDistClosestNumbers() {
    Assert.assertThat(BasicArrays.distClosestNumbers(1, 3, 5, 10, 45, -2), equalTo(2));
    Assert.assertThat(BasicArrays.distClosestNumbersSorting(1, 3, 5, 10, 45, -2), equalTo(2));
    Assert.assertThat(BasicArrays.distClosestNumbers(), equalTo(0));
  }

  @Test
  public void testBubbleSort() {
    Assert.assertThat(BasicArrays.bubbleSort(9,4,3,2,5,8,7,0,1,6), equalTo(new int[] {0,1,2,3,4,5,6,7,8,9}));
    Assert.assertThat(BasicArrays.bubbleSort(0), equalTo(new int[] {0}));
    Assert.assertThat(BasicArrays.bubbleSort(), equalTo(new int[] {}));
  }


}
