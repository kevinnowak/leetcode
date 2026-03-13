package com.github.kevinnowak.top_150.array_string._28_find_index_of_first_occurrence;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private static Stream<Arguments> provideDataForTestRemoveElement() {
        return Stream.of(
                Arguments.of("sadbutsad", "sad", 0),
                Arguments.of("leetcode", "leeto", -1),
                Arguments.of("hello", "ll", 2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideDataForTestRemoveElement")
    void testStrStr(String haystack, String needle, int expectedResult) {
        // Given
        Solution solution = new Solution();

        // When
        var actualResult = solution.strStr(haystack, needle);

        // Then
        assertEquals(expectedResult, actualResult);
    }
}