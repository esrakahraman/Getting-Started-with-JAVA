package com.company;

import java.util.Arrays;

public class day5 {
    public static void main(String[] args) {
        //Arrays - You can store multiple values
        int [] numbers = {2, 0, 1, 4, 100};
        String [] names = {"Ali", "Mark"};
        //int [] numbers = new int [3];
        //numbers [0] = 2;
        //numbers [1] = 0;
        //numbers [2] = 1;
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(names));
        System.out.println(names.length);


        int four = numbers [3];
        int lastIndex = numbers [numbers.length -1];
        System.out.println(four);
        System.out.println(lastIndex);
    }
}