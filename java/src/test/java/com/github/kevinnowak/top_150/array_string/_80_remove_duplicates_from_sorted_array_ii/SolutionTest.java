package com.github.kevinnowak.top_150.array_string._80_remove_duplicates_from_sorted_array_ii;

import com.github.kevinnowak.top_150.array_string._80_remove_duplicates_from_sorted_array_ii.Solution;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private static Stream<Arguments> provideDataForRestRemoveDuplicates() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 1, 2, 2, 3}, 5, new int[]{1, 1, 2, 2, 3}),
                Arguments.of(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3}, 7, new int[]{0, 0, 1, 1, 2, 3, 3})
        );
    }

    @ParameterizedTest
    @MethodSource("provideDataForRestRemoveDuplicates")
    void testRemoveDuplicates(int[] nums, int expectedResult, int[] expectedNums) {
        // Given
        var solution = new Solution();

        // When
        var result = solution.removeDuplicates(nums);

        // Then
        assertEquals(expectedResult, result);

        for (int i = 0; i < expectedResult; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }
}
