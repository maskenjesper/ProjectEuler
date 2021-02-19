package com.Problem4;

/**
 * Created by: Jakob Olsson
 * Date: 2020-10-28
 * Time: 12:32
 * Project: ProjectEuler
 * Copyright: MIT
 */

public class Problem4 {
    public static void main(String[] args) {
        int largestPalindrome = 0;

        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                if (i * j > largestPalindrome && isPalindrome(i * j)) {
                    largestPalindrome = i * j;
                }
            }
        }

        System.out.println("Largest palindrome: " + largestPalindrome);
    }

    public static boolean isPalindrome(int number) {
        String stringNumber = Integer.toString(number);

        int length = stringNumber.length();
        String subStringLeft = stringNumber.substring(0,length / 2);
        String subStringRight = stringNumber.substring(length / 2 + length % 2, length);
        int subStringLength = subStringLeft.length();

        for (int i = 0, j = subStringLength - 1; i < subStringLength; i++, j--) {
            if (subStringLeft.charAt(i) != subStringRight.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
