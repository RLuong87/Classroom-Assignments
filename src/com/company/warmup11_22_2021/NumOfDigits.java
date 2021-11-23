package com.company.warmup11_22_2021;

public class NumOfDigits {

    /*
    https://edabit.com/challenge/z9ofdqhTYi9tdCj5T
    Find Number of Digits in Number

    Create a function that will return an integer number corresponding to the amount of digits in the given integer num.

    Examples:
    numOfDigits(1000) ➞ 4

    numOfDigits(12) ➞ 2

    numOfDigits(1305981031) ➞ 10

    numOfDigits(0) ➞ 1

    Notes:
    Try to solve this challenge without using strings!
     */

    public static int numOfDigits(int num) {

//        int count = 0;

        String count = Integer.toString(Math.abs(num));

//        if (num == 0) {
//            return 1;
//        } else {
//            while (num != 0) {
//                num = num / 10;
//                count++;
//            }
//        }
        return count.length();

//        if (n / 10 == 0) { // Recursive Solution
//            return 1;
//        }
//        return 1 + digitsCount(n / 10);
    }

    public static void main(String[] args) {

        System.out.println(numOfDigits(-1000));
        System.out.println(numOfDigits(-12));
        System.out.println(numOfDigits(1305981031));
        System.out.println(numOfDigits(0));

        long number = 0;
        int count = (number + "").length();

        System.out.println(count);
//        System.out.println(number/10);

//        while (number != 0) {
//            number = number / 10;
//            count++;
//        }
//        System.out.println(count);
//        System.out.println(number);
    }
}
