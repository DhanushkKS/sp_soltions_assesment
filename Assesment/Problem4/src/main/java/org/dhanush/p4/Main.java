package org.dhanush.p4;

import java.util.Arrays;
import java.util.Comparator;

public class Main {


    public static String formLargestNumber(int[] numbers) {
        String[] numStrings = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numStrings[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(numStrings,new Comparator<String>() {
            public int compare(String a, String b) {
                String order1 =a+b;
                String order2 =b+a;
                return order2.compareTo(order1);
            }
        });
        if (numStrings[0].equals("0")) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (String numString : numStrings) {
            sb.append(numString);
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 90};  // Example input
        String result = formLargestNumber(nums);
        System.out.print("Largest possible number: " + result);
    }
}