package org.dhanush.p1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int addNumbersInForLoop(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }
        return sum;
    }
    public static int addNumbersInWhileLoop(int[] numbers) {
        int sum = 0;
        int i = 0;
        while (i < numbers.length) {
            sum += numbers[i];
            i++;
        }
        return sum;
    }
    public static int addNumbersInRecursion(int[] numbers) {
        return addNumbersHelper(numbers, 0);
    }

    private static int addNumbersHelper(int[] numbers, int index) {
        if (index == numbers.length) {
            return 0;
        }
        return numbers[index] + addNumbersHelper(numbers, index + 1);
    }


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("In For Loop "+ addNumbersInForLoop(numbers));
        System.out.println("In While Loop "+addNumbersInWhileLoop(numbers));
        System.out.println("In recursion "+addNumbersInRecursion(numbers));
}
}