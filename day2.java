package com.company;

public class day2 {
    public static void main(String[] args) {
        //Strings
        /*
        String name = new String("Amigoscode");
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(0));

        String code = new String("code");
        System.out.println(name.contains(code));
        System.out.println(name.equals(code));
        */

        // //Concatenating String
        // String name = "Alex";
        // String surname = "Fire";
        // String fullName = name + " " + surname + " " + 1;
        // System.out.println(fullName);

        // String fullName2 = name.concat(" ").concat(surname);
        // System.out.println(fullName2);



                        // upgraded version
            // Using StringBuilder for String Manipulation
        //the reason to use string builder is because in java strings are immutable so whenever you change or do some modification on string a new string will formed that eventually is not good so we,
        //have a string builder in java which solves this problem now whenever you change the string new string will not formed it gonna changed in same memory
        String name = "Alex";
        String surname = "Fire";

        // Using StringBuilder for concatenation
        StringBuilder fullNameBuilder = new StringBuilder();
        fullNameBuilder.append(name).append(" ").append(surname).append(" ").append(1);
        String fullName = fullNameBuilder.toString();
        System.out.println(fullName);

        // Using StringBuilder's append method
        StringBuilder fullNameBuilder2 = new StringBuilder(name);
        fullNameBuilder2.append(" ").append(surname);
        String fullName2 = fullNameBuilder2.toString();
        System.out.println(fullName2);
    }
}
