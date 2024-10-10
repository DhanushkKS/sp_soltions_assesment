package org.dhanush.p5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void findCombinations(int[] numbers, int target) {
        List<String> results = new ArrayList<>();
        findCombinationsRecursive(results, numbers, "", 0, 0, 0, target);
        for (String expr : results) {
            System.out.println(expr + " = " + target);
        }
    }

    private static void findCombinationsRecursive(List<String> results, int[] numbers, String expr,
                                                  int index, long prevNum, long currentSum, int target) {
        if (index == numbers.length) {
            if (currentSum == target) {
                results.add(expr);
            }
            return;
        }

        for (int i = index; i < numbers.length; i++) {
            String currentNumStr = "";
            for (int j = index; j <= i; j++) {
                currentNumStr += numbers[j];
            }
            long currentNum = Long.parseLong(currentNumStr);

            if (index == 0) {
                findCombinationsRecursive(results, numbers, currentNumStr, i + 1, currentNum, currentNum, target);
            } else {
                findCombinationsRecursive(results, numbers, expr + "+" + currentNumStr, i + 1, currentNum, currentSum + currentNum, target);

                findCombinationsRecursive(results, numbers, expr + "-" + currentNumStr, i + 1, -currentNum, currentSum - currentNum, target);
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 99;
        findCombinations(numbers, target);

    }
}