package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        for (int i = 0; i < left.length; i++) {
            if (left[i] - 1 == right[i] - 1) {
                return true;
            }
        }
        return false;
    }
}
