package org.example.string.splitstring;

public class ReversingString {
    public static void main(String[] args) {
        //       reverseResume();                  //Even String ("resume")
        reverseStringResumes("resumes");    //Odd String ("resumes")
    }

    private static void reverseResume() {
        String str = "resume";
        char temp;
        int length = 6;
        char[] array = str.toCharArray();
        for (int i = 0; i < length / 2; i++) {
            temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
            System.out.println(array);
        }
        String reverseString = new String(array);
        System.out.println("reverseString is:" + reverseString);
    }

    private static void reverseStringResumes(String str) {
        int length = 7;
        char temp;
        char[] array = str.toCharArray();
        for (int i = 0; i <= length / 2; i++) {
            temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
            System.out.println(array);
        }
        String reverseString = new String(array);
        System.out.println("output is:" + reverseString);
    }
}

