package com.github.kevinnowak.programming_skills._1768_merge_strings_alternately;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("provideDataForTestMergeAlternately")
    void testmergeAlternately(String word1, String word2, String expectedResult) {
        // Given
        Solution solution = new Solution();

        // When
        var actualResult = solution.mergeAlternately(word1, word2);

        // Then
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideDataForTestMergeAlternately() {
        return Stream.of(
                Arguments.of("abc", "pqr", "apbqcr"),
                Arguments.of("ab", "pqrs", "apbqrs"),
                Arguments.of("abcd", "pq", "apbqcd")
        );
    }
}
