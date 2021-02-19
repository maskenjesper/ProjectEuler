package com.Problem7;

import com.math.Primes;

/**
 * Created by: Jakob Olsson
 * Date: 2020-10-29
 * Time: 09:20
 * Project: ProjectEuler
 * Copyright: MIT
 */

public class Problem7 {
    public static void main(String[] args) {
        int largestPrime = 0;
        int counter = 0;
        for (int i = 2; counter <= 10001; i++) {
            if (Primes.isPrime(i)) {
                counter++;
                largestPrime = i;
            }
        }

        System.out.println("Largest prime: " + largestPrime);
    }
}
