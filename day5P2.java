package com.company;

public class day5P2 {
    public static void main(String[] args) {
        //Loops
        int[] numbers = {2, 0, 1, 4, 100, 4, 90, 78, 77};
        for (int i=0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        //Reverse order
        //for (int i = 0; i < numbers.length; i--){
        //    System.out.println(numbers[i]);
        //}

        System.out.println("Enhanced for Loop");
        for (int number : numbers){
            System.out.println(number);
        }
    }
}