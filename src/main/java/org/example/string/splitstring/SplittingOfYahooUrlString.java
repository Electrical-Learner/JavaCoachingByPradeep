package org.example.string.splitstring;

public class SplittingOfYahooUrlString {

    public static void main(String[] args) {

        System.out.println();
        String url = "https://www.yahoo.com/Image/Techie.png";
        System.out.println("Splitting of url = " + url);
        System.out.println();


        //First Step Of Splitting
        String[] firstStepOfSplitting = url.split("//");
        System.out.println("------------firstStepOfSplitting" + "\n" + "Length is:" + firstStepOfSplitting.length);
        for (int i = 0; i < firstStepOfSplitting.length; i++) {
            System.out.println("firstStepOfSplitting[" + i + "]-" + firstStepOfSplitting[i]);
        }
        System.out.println("------------end of firstStepOfSplitting");
        System.out.println();


        //Second Step Of Splitting
        String[] secondStepOfSplitting = firstStepOfSplitting[1].split("/");
        System.out.println("------------secondStepOfSplitting" + "\n" + "Length is: " + secondStepOfSplitting.length);
        for (int i = 0; i < secondStepOfSplitting.length; i++) {
            System.out.println("secondStepOfSplitting[" + i + "]-" + secondStepOfSplitting[i]);
        }
        System.out.println("------------End Of secondStepOfSplitting");
        System.out.println();


        //Third Step Of Splitting
        String[] thirdStepOfSplitting = secondStepOfSplitting[0].split("[.]");
        System.out.println("------------thirdStepOfSplitting" + "\n" + " Length is: " + thirdStepOfSplitting.length);
        for (int i = 0; i < thirdStepOfSplitting.length; i++) {
            System.out.println("thirdStepOfSplitting[" + i + "]-" + thirdStepOfSplitting[i]);
        }
        System.out.println("------------End Of thirdStepOfSplitting");
        System.out.println();

        System.out.println("Output");
        System.out.println("------------");
        System.out.println("Company Name is: " + thirdStepOfSplitting[1]);
        System.out.println("File Name is: " + secondStepOfSplitting[2]);
        System.out.println("------------");


    }
}
