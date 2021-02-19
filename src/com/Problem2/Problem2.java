package com.Problem2;

/**
 * Created by: Jakob Olsson
 * Date: 2020-10-27
 * Time: 23:39
 * Project: ProjectEuler
 * Copyright: MIT
 */

public class Problem2 {
    public static void main(String[] args) {
        int sum = 0;
        int n1 = 1, n2 = 2;

        while (n2 < 4_000_000) {
            if (n2 % 2 == 0) {
                sum += n2;
            }

            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }

        System.out.println("Sum: " + sum);
    }
}
