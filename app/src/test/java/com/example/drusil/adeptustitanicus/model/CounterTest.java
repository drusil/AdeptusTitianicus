package com.example.drusil.adeptustitanicus.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {
  private Counter counter;

  @Before
  public void before() {
    counter = new Counter(3);
    counter.loadData("3+/3+/4+");
  }

  @Test
  public void whenAddCounterCurrentCounterIncrease() {
    counter.addCounter();
    assertEquals(1, counter.getCurrentCount());
  }

  @Test
  public void whenTryAddCounterWhenMaxCounterDontIncrease() {
    counter.addCounter();
    counter.addCounter();
    assertEquals(2, counter.getCurrentCount());
    counter.addCounter();
    assertEquals(2, counter.getCurrentCount());
  }

  @Test
  public void whenSubCounterThenCurrentCounterDecrease() {
    counter.addCounter();
    counter.addCounter();
    assertEquals(2, counter.getCurrentCount());
    counter.subCounter();
    assertEquals(1, counter.getCurrentCount());
  }

  @Test
  public void whenSubCounterThenYouCantGoBelowZero() {
    counter.subCounter();
    assertEquals(0, counter.getCurrentCount());
  }

  @Test
  public void youCanLoadDataCorrectlyInToArray() {
    assertEquals("3+", counter.getCurrentData());
    counter.addCounter();
    assertEquals("3+", counter.getCurrentData());
    counter.addCounter();
    assertEquals("4+", counter.getCurrentData());
  }


}