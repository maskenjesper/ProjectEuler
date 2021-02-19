package com.Problem3; /**
 * Created by: Jakob Olsson
 * Date: 2020-10-27
 * Time: 23:51
 * Project: ProjectEuler
 * Copyright: MIT
 */

/********************************************************************

 Primtalsfaktorisera 600851475143
    Dela med minsta möjliga primtal
    Spara detta primtal och kvoten
    Upprepa för denna kvot tills kvoten i sig är ett primtal
 Jämför primtalsfaktoerer och välj den största

 ********************************************************************/

public class Problem3 {
    public static void main(String[] args) {

        long number = 600851475143L;

        printFactorization(number);
        System.out.println();
        printFactorization(150);
        System.out.println();
        printFactorization(1001);
    }

    public static boolean isPrime(long a) {
        for (long i = 2; i < a / 2; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static long smallestPrimeFactor(long a) {
        for (long i = 2; i < a / 2; i++) {
            if (a % i == 0 && isPrime(i)) {
                return i;
            }
        }
        return a;
    }

    public static void printFactorization(long number) {
        while (true) {
            long smallestPrimeFactor = smallestPrimeFactor(number);
            System.out.println(smallestPrimeFactor);
            if (isPrime(number)) {
                return;
            }
            else {
                number = number / smallestPrimeFactor;
            }
        }
    }
}
