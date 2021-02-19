package com.Problem5;

/**
 * Created by: Jakob Olsson
 * Date: 2020-10-28
 * Time: 19:25
 * Project: ProjectEuler
 * Copyright: MIT
 */

public class Problem5 {
    public static void main(String[] args) {
        System.out.println(smallestDivisibleTo(20));
    }

    public static int smallestDivisibleTo(int number) {
        int i = 1;
        while (true) {
            for (int j = 1; j <= number; j++) {
                if (i % j != 0) {
                    break;
                }
                else if (j == number) {
                    return i;
                }
            }
            i++;
        }
    }
}
