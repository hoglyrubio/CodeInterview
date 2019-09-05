package com.hogly;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class BasicLogicTest {

  @Test
  public void testReverseNumber() {
    int number = 1234;
    //assertThat(BasicLogic.reverseNumber(number), Matchers.equalTo(4321));
    System.out.println(BasicLogic.reverseNumber(number));
    System.out.println(number);
    //assertThat(BasicLogic.reverseNumber(-1234), Matchers.equalTo(-4321));
  }

  @Test
  public void findTest() {
    assertEquals(5, BasicLogic.findOddTimes(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
    assertEquals(-1, BasicLogic.findOddTimes(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
    assertEquals(5, BasicLogic.findOddTimes(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
    assertEquals(10, BasicLogic.findOddTimes(new int[]{10}));
    assertEquals(10, BasicLogic.findOddTimes(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
    assertEquals(1, BasicLogic.findOddTimes(new int[]{5,4,3,2,1,5,4,3,2,10,10}));
  }

  @Test
  public void findTestJava8() {
    assertEquals(5, BasicLogic.findOddTimesJava8(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
    assertEquals(-1, BasicLogic.findOddTimesJava8(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
    assertEquals(5, BasicLogic.findOddTimesJava8(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
    assertEquals(10, BasicLogic.findOddTimesJava8(new int[]{10}));
    assertEquals(10, BasicLogic.findOddTimesJava8(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
    assertEquals(1, BasicLogic.findOddTimesJava8(new int[]{5,4,3,2,1,5,4,3,2,10,10}));
  }

}
