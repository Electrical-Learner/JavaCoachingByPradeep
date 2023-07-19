package org.example.arrays;

public class StringExample {

    public static void main(String[] args) {
        printStringByCharacter("classmate");
    }

    private static void printStringByCharacter(String str) {
        System.out.println(str);
        char[] arrayOfString = str.toCharArray();
        System.out.println("Length of String is:" + arrayOfString.length);
//        for (int i = 0; i < arrayOfString.length; i++) {
//            System.out.println("character of a string is: " + arrayOfString[i]);
//        }
        StringBuilder stringBuilder = new StringBuilder(str);
        StringBuilder str2 = stringBuilder.reverse();
        System.out.println("stringBuilder Reverse is:" + str2);
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.append("Q" + "U");
        System.out.println("StringBuffer is:" + stringBuffer);
        stringBuffer.delete(9,11);
       // System.out.println("Length is" + str2.length());
        System.out.println("Delete string is:" + stringBuffer);
        stringBuffer.charAt(0);

    }
}
