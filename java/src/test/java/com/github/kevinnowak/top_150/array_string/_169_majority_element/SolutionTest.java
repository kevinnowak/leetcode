package com.github.kevinnowak.top_150.array_string._169_majority_element;

import com.github.kevinnowak.top_150.array_string._169_majority_element.Solution;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, 3}, 3),
                Arguments.of(new int[]{2, 2, 1, 1, 1, 2, 2}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    void testMajorityElement(int[] nums, int expectedResult) {
        // Given
        Solution solution = new Solution();

        // When
        var actualResult = solution.majorityElement(nums);

        // Then
        assertEquals(expectedResult, actualResult);
    }
}
