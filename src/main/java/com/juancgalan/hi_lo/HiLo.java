package com.juancgalan.hi_lo;

import java.util.Scanner;

public class HiLo {
  public static void main(String... args) {
    HiLo hilo = new HiLo();
    hilo.playGame();
  }

  private void playGame() {
    int number = randomBetweenInts(1, 100);
    int guess = askNumber();
    System.out.print(checkGuess(guess, number));
    while (guess != number) {
      System.out.println("Try again.");
      System.out.print(checkGuess(guess, number));
      guess = askNumber();
    }
    System.out.println("You win!");
  }

  private int randomBetweenInts(int x1, int x2) {
    double f = Math.random() / Math.nextDown(1.0);
    return (int) (x1 * (1.0 - f) + x2 * f);
  }

  private int askNumber() {
    Scanner scan  = new Scanner(System.in);
    System.out.println("Guess a number between 1 and 100");
    return scan.nextInt();
  }

  public String checkGuess(int guess, int expected) {
    if (guess < expected)
      return "It's too low.";
    else if (guess > expected)
      return "It's too high.";
    else
      return "It's correct!";
  }
}
