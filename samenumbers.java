package com.ofir;

import java.util.Arrays;
import java.util.Scanner;

public class samenumbers {
    static final Scanner SCANNER = new Scanner(System.in);
    static final int SAME_NUMBERS = 5;

    // final int samenumbers = SCANNER.nextInt();
    // final int [] samenumbers = new int[samenumbers];

    public static void main(String[] args) {
        System.out.print("Please enter the numbers amount: ");
        int [] numbers = new int [SCANNER.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Please enter a number: ");
            numbers [i] = SCANNER.nextInt();
        }
        // if (final int i < samenumbers.length == final int i < samenumbers.length){
        // System.out.println("The same numbers are: + i +  ");
        // }else

        for (int i = 0; i < numbers.length; i++) {
            Arrays.sort(numbers);
            System.out.println(numbers[i] + "");
        }
    }
}

