package com.github.kevinnowak.top_150._121_best_time_to_buy_and_sell_stock;

class Solution {

    // Time complexity O(n)
    int maxProfit(int[] prices) {
        int maxDiff = 0;

        for (int i = 0, lowest = prices[i]; i < prices.length; i++) {
            lowest = Math.min(lowest, prices[i]);
            maxDiff = Math.max(maxDiff, prices[i] - lowest);
        }

        return maxDiff;
    }

// Time complexity O(n^2)
//    int maxProfit(int[] prices) {
//        int maxDiff = 0;
//
//        for (int i = 0; i < prices.length - 1; i++) {
//            for (int j = i + 1; j < prices.length; j++) {
//                if (prices[i] < prices[j]) {
//                    maxDiff = Math.max(maxDiff, prices[j] - prices[i]);
//                }
//            }
//        }
//
//        return maxDiff;
//    }
}
