package com.github.kevinnowak.top_150._27_remove_element;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("provideDataForTestRemoveElement")
    void testRemoveElement(int[] nums, int val, int[] expectedNums) {
        // Given
        Solution solution = new Solution();

        // When
        var result = solution.removeElement(nums, val);
        Arrays.sort(nums, 0, expectedNums.length);

        // Then
        assertEquals(expectedNums.length, result);

        for (int i = 0; i < expectedNums.length; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }

    private static Stream<Arguments> provideDataForTestRemoveElement() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, 2, 3}, 3, new int[]{2, 2}),
                Arguments.of(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2, new int[]{0, 0, 1, 3, 4})
        );
    }
}
