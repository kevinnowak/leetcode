package com.github.kevinnowak.maven.programming_skills._283_move_zeroes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[] {1, 2, 3, 0, 4}, new int[] {1, 2, 3, 4, 0}),
                Arguments.of(new int[] {0, 1, 0, 3, 12}, new int[] {1, 3, 12, 0, 0}),
                Arguments.of(new int[] {0}, new int[] {0}));
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    void testMoveZeroes(int[] nums, int[] expectedResult) {
        // Given
        Solution solution = new Solution();

        // When
        solution.moveZeroesFaster(nums);

        // Then
        assertArrayEquals(expectedResult, nums);
    }
}
