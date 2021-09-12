package com.company;

public class day5P3 {
    public static void main(String[] args) {
        // Break and Continue
        String [] names = {"Anna", "Ali", "Bob", "Mike"};
        for (String name : names) {
            if (name.equals("Bob")) {
                break;
            }
            System.out.println(name);
        }

        for (String name : names){
            if (name.startsWith("A")){
                continue;
            }
            System.out.println(name);
        }
    }
}