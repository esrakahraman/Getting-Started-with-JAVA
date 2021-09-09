package com.company;

public class day4 {
    public static void main(String[] args) {
        //if statements
        int age = 17;
        if (age >= 18){
            System.out.println("Hooray! I am an adult");
        } else if (age >= 16 && age <18){
            System.out.println("I am almost an adult");
        } else {
            System.out.println("I am not an adult");
        }
        System.out.println();

        //Ternary operator - condensed form of the if-elsestatement that also returns a value
        String message = age >= 18 ?
                "Hooray! I am an adult":
                "I am not an adult";
        System.out.println(message);
        System.out.println();

        //Switch Statement
        String gender = "Female";
        switch(gender){
            case "Female":
                System.out.println("I am a female");
                break;
            case "Male":
                System.out.println("I am a male");
                break;
            case "PreferNotSay":
                System.out.println("prefer not say");
                break;
            default:
                System.out.println("Unknown gender");
        }
    }
}