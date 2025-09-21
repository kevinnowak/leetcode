package com.github.kevinnowak.programming_skills._389_find_the_difference;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("provideDataForTestFindTheDifference")
    void testFindTheDifference(String s, String t, char expectedResult) {
        // Given
        Solution solution = new Solution();

        // When
        var givenResult = solution.findTheDifference(s, t);

        // Then
        assertEquals(expectedResult, givenResult);
    }

    private static Stream<Arguments> provideDataForTestFindTheDifference() {
        return Stream.of(
                Arguments.of("abcd", "abcde", "e"),
                Arguments.of("", "y", "y"),
                Arguments.of("a", "aa", "a")
        );
    }
}
