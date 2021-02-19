package com.math;

/**
 * Created by: Jakob Olsson
 * Date: 2020-11-01
 * Time: 15:55
 * Project: ProjectEuler
 * Copyright: MIT
 */

public class Primes {
    public static boolean isPrime(long a) {
        for (long i = 2; i < a / 2; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
