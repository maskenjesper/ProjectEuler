package com.Problem1;

/**
 * Created by: Jakob Olsson
 * Date: 2020-10-27
 * Time: 23:31
 * Project: ProjectEuler
 * Copyright: MIT
 */

public class Problem1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        System.out.println("Sum: " + sum);
    }
}
