package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean condition = left > right;
        int result = condition ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int result1 = Max.max(5, 4);
        int result2 = Max.max(1, 3);
        int result3 = Max.max(8, 8);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
