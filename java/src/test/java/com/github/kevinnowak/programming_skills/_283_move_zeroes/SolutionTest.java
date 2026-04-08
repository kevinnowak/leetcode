package com.github.kevinnowak.programming_skills._283_move_zeroes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;

class SolutionTest {

  private static Stream<Arguments> provideParameters() {
    return Stream.of(
        Arguments.of(new int[] {1, 2, 3, 4, 5}, 2, new int[] {4, 5, 1, 2, 3}),
        Arguments.of(new int[] {1, 2, 3, 4, 5, 6, 7}, 3, new int[] {5, 6, 7, 1, 2, 3, 4}),
        Arguments.of(new int[] {-1, -100, 3, 99}, 2, new int[] {3, 99, -1, -100}),
        Arguments.of(new int[] {-1}, 2, new int[] {-1}),
        Arguments.of(new int[] {1, 2}, 7, new int[] {2, 1}));
  }

  @Test
  void moveZeroes() {}
}
