package com.github.kevinnowak.maven.programming_skills._459_repeated_substring_pattern;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("provideParameters")
    void testRepeatedSubstringPattern(String s, boolean expectedResult) {
        // Given
        Solution solution = new Solution();

        // When
        var actualResult = solution.repeatedSubstringPattern(s);

        // Then
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of("abab", true),
                Arguments.of("aba", false),
                Arguments.of("abcabcabcabc", true),
                Arguments.of("ababab", true));
    }
}
