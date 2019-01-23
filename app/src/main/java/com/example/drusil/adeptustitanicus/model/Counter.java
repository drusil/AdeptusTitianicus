package com.example.drusil.adeptustitanicus.model;

import java.util.*;

public class Counter {
  private String[] data;
  private int max;
  private int currentCount;

  public Counter(int max) {
    this.max = max;
    currentCount = 0;
    data = new String[max];
  }

  public void addCounter() {
    if (currentCount < max - 1) {
      currentCount++;
    }
  }

  public int getCurrentCount() {
    return currentCount;
  }

  public void subCounter() {
    if (currentCount != 0) {
      currentCount--;
    }
  }

  public void loadData(String string) {
    data = string.split("/");
  }


  public String getCurrentData() {
    return data[currentCount];
  }
}
