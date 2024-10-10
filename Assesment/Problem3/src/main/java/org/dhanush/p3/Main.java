package org.dhanush.p3;

public class Main {
    public static int[] countFibonacci(int n) {
        int[] fibonacciNumbers = new int[n];

        fibonacciNumbers[0] = 0;
        fibonacciNumbers[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }
        return fibonacciNumbers;
    }

    public static void main(String[] args) {
        int[] fibonacciSeries = countFibonacci(100);
        for (int num: fibonacciSeries) {
            System.out.print(num + " ");
        }
    }
}