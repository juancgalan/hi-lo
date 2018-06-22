package com.juancgalan.hi_lo;

import java.util.Scanner;

public class HiLo {
  public static void main(String... args) {
    double f = Math.random() / Math.nextDown(1.0);
    int number = (int) (100 * f);
    Scanner scan  = new Scanner(System.in);
    int guess = 0;
    System.out.println("Guess a number between 1 and 100");
    guess = scan.nextInt();

  }
}
