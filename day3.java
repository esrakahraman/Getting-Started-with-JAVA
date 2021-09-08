package com.company;


public class day3 {
    public static void main(String[] args) {
        //Arithmetic Operations
        System.out.println(10 + 2);
        System.out.println(10 - 2);
        System.out.println();

        //Bodmas
        System.out.println(10 * (2 +7));
        System.out.println(10 % 2);
        System.out.println();

        //Math
        System.out.println(Math.abs(-10));
        System.out.println(Math.max(6,10));
        System.out.println(Math.min(6,10));
        System.out.println((int) Math.pow(5,2));
        System.out.println((int) Math.sqrt(25));
        System.out.println(Math.PI);
        System.out.println();

        //Comparison Operators
        int esraAge = 29;
        int alexAge = 36;
        System.out.println(esraAge > alexAge);
        System.out.println(esraAge >= alexAge);
        System.out.println(esraAge < alexAge);
        System.out.println(esraAge <= alexAge);
        System.out.println(esraAge == alexAge);
        System.out.println(esraAge != alexAge);
        System.out.println();

        //Logical Operators
        boolean isAdult = false;
        boolean isStudent = true;
        boolean isMember = false;
        String name = "Mark";
        System.out.println((!isAdult || isStudent) && isMember);
        System.out.println((10 > 8 || 2<=2) && !isAdult && name.contains("M"));

    }
}
