package com.github.kevinnowak.top_150._58_length_of_last_word;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("provideParameters")
    void testLengthOfLastWord(String s, int expectedResult) {
        // Given
        Solution solution = new Solution();

        // When
        int actualResult = solution.lengthOfLastWord(s);

        // Then
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of("Hello World", 5),
                Arguments.of("   fly me   to   the moon  ", 4),
                Arguments.of("luffy is still joyboy", 6)
        );
    }
}
