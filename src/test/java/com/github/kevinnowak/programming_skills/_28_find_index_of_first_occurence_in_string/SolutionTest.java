package com.github.kevinnowak.programming_skills._28_find_index_of_first_occurence_in_string;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("provideParameters")
    void testStrStr(String haystack, String needle, int expectedResult) {
        // Given
        Solution solution = new Solution();

        // When
        var actualResult = solution.strStr(haystack, needle);

        // Then
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of("sadbutsad", "sad", 0),
                Arguments.of("leetcode", "leeto", -1)
        );
    }
}
