package com.github.kevinnowak.programming_skills._189_rotate_array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 2, new int[]{4, 5, 1, 2, 3}),
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 7}, 3, new int[]{5, 6, 7, 1, 2, 3, 4}),
                Arguments.of(new int[]{-1, -100, 3, 99}, 2, new int[]{3, 99, -1, -100}),
                Arguments.of(new int[]{-1}, 2, new int[]{-1}),
                Arguments.of(new int[]{1, 2}, 7, new int[]{2, 1})
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    void testRotate(int[] nums, int k, int[] expectedResult) {
        // Given
        Solution solution = new Solution();

        // When
        solution.rotate(nums, k);

        // Then
        assertArrayEquals(expectedResult, nums);
    }
}
