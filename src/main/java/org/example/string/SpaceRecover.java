package org.example.string;

public class SpaceRecover {
    public static void main(String[] args) {
       // String input = "Run Till End";
     //   spaceRecover("Run Till End");  //Run Till Ends
        System.out.println("Dog:Speak(\"Bark\")");
        System.out.println("Dog:Speak('Bark')");
        System.out.println('a'+'b');
    }

    private static void spaceRecover(String str) {
        char ch = 'Q';
        String output;
        output= str.replace(' ',ch);
        System.out.println("After replacing space with" + " " + "$:");
        System.out.println(output);
    }
}
