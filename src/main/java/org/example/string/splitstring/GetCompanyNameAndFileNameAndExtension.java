package org.example.string.splitstring;

public class GetCompanyNameAndFileNameAndExtension {
    public static void main(String[] args) {
        SplittingOfBingSearchUrlString("https://www.BingSearch.com/Songs/xyz.mp3");
    }
    private static void SplittingOfBingSearchUrlString(String url) {
        System.out.println();
        System.out.println("Splitting of url = " + url);
        System.out.println();

        //First Step Of Splitting
        String[] firstStepOfSplitting = url.split("//");
        System.out.println("------------firstStepOfSplitting" + "\n" + "Length Is: " + firstStepOfSplitting.length);
        for (int i = 0; i < firstStepOfSplitting.length; i++) {
            System.out.println("firstStepOfSplitting[" + i + "]-" + firstStepOfSplitting[i]);
        }
        System.out.println("------------End of firstStepOfSplitting");
        System.out.println();


        //Second Step Of Splitting
        String[] secondStepOfSplitting = firstStepOfSplitting[1].split("/");
        System.out.println("------------secondStepOfSplitting" + "\n" + "Length Is: " + secondStepOfSplitting.length);
        for (int i = 0; i < secondStepOfSplitting.length; i++) {
            System.out.println("secondStepOfSplitting[" + i + "]-" + secondStepOfSplitting[i]);
        }
        System.out.println("------------End Of secondStepOfSplitting");
        System.out.println();

        //Third Step Of Splitting
        String[] thirdStepOfSplitting = secondStepOfSplitting[0].split("[.]");
        System.out.println("------------thirdStepOfSplitting" + "\n" + "Length Is: " + thirdStepOfSplitting.length);
        for(int i = 0; i< thirdStepOfSplitting.length; i++){
            System.out.println("thirdStepOfSplitting[" + i +"]-" + thirdStepOfSplitting[i]);
        }
        System.out.println("------------End Of thirdStepOfSplitting");
        System.out.println();

        System.out.println("------------");
        System.out.println("Output");
        System.out.println("Company Name Is- " + thirdStepOfSplitting[1]);
        System.out.println("File Name Is- " + secondStepOfSplitting[2]);
        System.out.println("------------");
    }
}
