package com.Problem6;

/**
 * Created by: Jakob Olsson
 * Date: 2020-10-29
 * Time: 09:09
 * Project: ProjectEuler
 * Copyright: MIT
 */

public class Problem6 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("Difference: " + (squareOfSum(number) - sumOfSquares(number)));
    }

    public static int sumOfSquares(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i * i;
        }

        return sum;
    }

    public static int squareOfSum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        int square = sum * sum;

        return square;
    }
}
