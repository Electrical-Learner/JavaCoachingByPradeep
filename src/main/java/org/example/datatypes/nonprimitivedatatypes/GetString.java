package org.example.datatypes.nonprimitivedatatypes;

import java.sql.SQLOutput;

public class GetString {
    public static void main(String[] args) {
        String str = "string";
        String string = new String("String");

        String str2 = "String";

        String string2 = new String("String");

//        boolean isEqualConstantPool = str.equals(str2);
//        System.out.println("Constant Pool: " + isEqualConstantPool);
//
//        boolean isDoubleEqualConstantPool = str == str2;
//        System.out.println("Constant Pool: " + isDoubleEqualConstantPool);
//
//        boolean isEqualNonConstantPool = string.equals(string2);
//        System.out.println("Non-Constant Pool: " + isEqualNonConstantPool);
//
//        boolean isDoubleEqualNonConstantPool = string == string2;
//        System.out.println("Non-Constant Pool: " + isDoubleEqualNonConstantPool);

        // Compareing Two Strings
       boolean compare  =  str.equals(str2);
        System.out.println("Result is : " + compare);

        // Convert string to lowercase
        String test = "WORLD";
        System.out.println("Lower Case is: " + test.toLowerCase());

        // Convert string to uppercase
        String test1 = "bmw";
        System.out.println("Upper Case is: " + test1.toUpperCase());

        //print the exact string in index
        String test2 = "Mercedes";
        System.out.println("The charAt is: " + test2.charAt(5));

        //chars
        String test3 = "charcoal";
        System.out.println(test3.chars());

        //compare string with another string ,displays no. of difference
        String t1 = "halo";
        String t2 = "hdzlo";
        System.out.println("compare difference is: " + t1.compareTo(t2));


        //adds to string
        String a1 = "Tony";
        String a2 = " Strak";
        System.out.println( "Concat is: " + 10 + 20 + " " + a1.concat(a2) + " " + 10 + 20);


        //checks the character in a string
        String b1 = "Megalodon";
        System.out.println( "The contains is: " + b1.contains("m"));

        // checks ending suffix and returns boolean
        String b2 = "Attend";
        System.out.println("Ends with: " + b2.endsWith("d"));

        // compares two strings and neglects upper/lower case
        String b3 = "nearly";
        String b4 = "NEARLY";
        System.out.println("answer of equalsignorecase is: " + b3.equalsIgnoreCase(b4));

        String b5 = "NEARLY";
        System.out.println("answer for IndexOf: " + b5.indexOf(0));

        System.out.println();
        String b6 = "NEARLY";
        char[] value= b6.toCharArray();
        for (int i=0;i<value.length; i++){
            System.out.println("answer for tochararray Of: " + value[i]);
        }
        System.out.println();
        String b7 = new String[]{"n", "a"}.toString();
        System.out.println("string is:" + b7);



    }


}
