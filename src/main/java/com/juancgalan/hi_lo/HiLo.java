package com.juancgalan.hi_lo;

public class HiLo {
  public static void main(String... args) {
    double f = Math.random() / Math.nextDown(1.0);
    int number = (int) (100 * f);
    System.out.println("Guess a number between 1 and 100");

  }
}
