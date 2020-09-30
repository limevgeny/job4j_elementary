package ru.job4j.condition;

public class sqArea {
    public static double square(int p, int k) {
        double height = (double)p / (2 * (k + 1));
        double length = height * k;
        return length * height;
    }

    public static void main(String[] args) {
        double result = sqArea.square(6, 2);
        System.out.println("If p = 6, k = 2, then s = " + result);
    }
}
