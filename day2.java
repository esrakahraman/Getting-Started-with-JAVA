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

        //Concatenating String
        String name = "Alex";
        String surname = "Fire";
        String fullName = name + " " + surname + " " + 1;
        System.out.println(fullName);

        String fullName2 = name.concat(" ").concat(surname);
        System.out.println(fullName2);
    }
}
