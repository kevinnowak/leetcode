package com.github.kevinnowak.top_150.array_string._189_rotate_array;

import com.github.kevinnowak.top_150.array_string._189_rotate_array.Solution;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 7}, 3, new int[]{5, 6, 7, 1, 2, 3, 4}),
                Arguments.of(new int[]{-1, -100, 3, 99}, 2, new int[]{3, 99, -1, -100})
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
