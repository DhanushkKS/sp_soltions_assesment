package org.dhanush.p2;

public class Main {
    public static String[] concatLists(String[] list1, String[] list2) {
        String[] output = new String[list1.length + list2.length];
        for (int i = 0; i < list1.length; i++) {
            output[2 * i] = list1[i];
            output[2 * i + 1] = list2[i];
        }
        return output;
    }

    public static void main(String[] args) {
        String[] list1 = {"a", "b", "c", "d"};
        String[] list2 = {"1", "2", "3", "4"};
        String[] concatLists = concatLists(list1, list2);
        for (String s : concatLists) {
            System.out.print(s);
         }
    }
}
