package org.example.string.splitstring;

public class SumOfStringIntegers {
    public static void main(String[] args) {
        sumOfStringIntegers("https://123.www.google.com/234/hello");
    }

    private static void sumOfStringIntegers(String url) {
        System.out.println("String Is-" + url);
        System.out.println();

        //firstStepOfSplitting
        String[] firstStepOfSplitting = url.split("//");
        System.out.println("----------firstStepOfSplitting" + "\n" + "Length Is=" + firstStepOfSplitting.length);
        for (int i = 0; i < firstStepOfSplitting.length; i++) {
            System.out.println("firstStepOfSplitting[" + i + "]-" + firstStepOfSplitting[i]);
        }
        System.out.println("----------End Of firstStepOfSplitting");
        System.out.println();

        //secondStepOfSplitting
        String[] secondStepOfSplitting = firstStepOfSplitting[1].split("/");
        System.out.println("----------secondStepOfSplitting" + "\n" + "Length Is=" + secondStepOfSplitting.length);
        for (int i = 0; i < secondStepOfSplitting.length; i++) {
            System.out.println("secondStepOfSplitting[" + i + "]-" + secondStepOfSplitting[i]);
        }
        System.out.println("----------End Of firstStepOfSplitting");
        System.out.println();

        //thirdStepOfSplitting
        String[] thirdStepOfSplitting = secondStepOfSplitting[0].split("[.]");
        System.out.println("----------thirdStepOfSplitting" + "\n" + "Length Is=" + thirdStepOfSplitting.length);
        for (int i = 0; i < thirdStepOfSplitting.length; i++) {
            System.out.println("thirdStepOfSplitting[" + i + "]-" + thirdStepOfSplitting[i]);
        }
        System.out.println("----------End Of thirdStepOfSplitting");
        System.out.println();

        //Output
        System.out.println("----------");
        System.out.println("Output Is-" + (Integer.parseInt(secondStepOfSplitting[1]) + Integer.parseInt(thirdStepOfSplitting[0])));
        System.out.println("----------");
    }
}

