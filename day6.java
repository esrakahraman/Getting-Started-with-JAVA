package com.company;

public class day6 {
    public static void main(String[] args) {
        //While loop
        int count = 0;
        while (count <= 20){
            System.out.println("count " + count);
            count++;
        }

        //Do while loop
        do {
            System.out.println(count);
            count++;
        }
        while (count <= 20);
    }
}
