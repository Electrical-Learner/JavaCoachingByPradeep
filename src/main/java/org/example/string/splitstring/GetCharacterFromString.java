package org.example.string.splitstring;

public class GetCharacterFromString {
    public static void main(String[] args) {
        getCharacterFromString(args[0]);
    }

    private static void getCharacterFromString(String str) {
//        str = str.toUpperCase(); //converts string to uppercase
        System.out.println(str); //printing the string stored in str variable
        char[] array = str.toCharArray();  //converts the String into sequence of array
        for (int i = 0; i < array.length; i++) {  //starts from o(index) and runs till array length and increment happens
            // System.out.println("i value is:" + i + " " + "array value is:" + array[i]);
            if (array[i] == 'I') {  //checks ,string is equal to the user defined string
                System.out.println("Character:" + array[i] + " " + "Is At Index[" + i + "]");
            }
        }
    }
}




