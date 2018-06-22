package com.juancgalan.hi_lo;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HiLoTest {
  @Test
  public void checkGuessShouldDetectLower() {
    HiLo hilo = new HiLo();
    String expected = "It's too low.";
    String actual = hilo.checkGuess(3, 5);
    assertThat(actual, equalTo(expected));
  }

  @Test
  public void checkGuessShouldDetectHigher() {
    HiLo hilo = new HiLo();
    String expected = "It's too high.";
    String actual = hilo.checkGuess(7, 5);
    assertThat(actual, equalTo(expected));
  }

  @Test
  public void checkGuessShouldDetectCorrect() {
    HiLo hilo = new HiLo();
    String expected = "It's correct!";
    String actual = hilo.checkGuess(7, 5);
    assertThat(actual, equalTo(expected));
  }
}
