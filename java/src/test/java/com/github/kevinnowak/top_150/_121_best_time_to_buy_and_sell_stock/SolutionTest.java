package com.github.kevinnowak.top_150._121_best_time_to_buy_and_sell_stock;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(new int[]{7, 1, 5, 3, 6, 4}, 5),
                Arguments.of(new int[]{7, 6, 4, 3, 1}, 0),
                Arguments.of(new int[]{1, 2}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    void testMaxProfit(int[] prices, int expectedResult) {
        // Given
        Solution solution = new Solution();

        // When
        var actualResult = solution.maxProfit(prices);

        // Then
        assertEquals(expectedResult, actualResult);
    }
}
