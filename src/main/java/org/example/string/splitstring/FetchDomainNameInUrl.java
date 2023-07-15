package org.example.string.splitstring;

import org.w3c.dom.ls.LSOutput;

public class FetchDomainNameInUrl {
    public static void main(String[] args) {
        checkCountryBelong(printDomainName(checkLink(args[0])));
    }


    public static String checkLink(String str) {
        String[] firstStepOfSplitting = str.split(":");
        String value = "https";
        if (firstStepOfSplitting[0].equals(value)) { //to compare two string we must use .equals
            System.out.println(firstStepOfSplitting[0] + " " + "Link Is Secured");
        } else {
            System.out.println(firstStepOfSplitting[0] + " " + "Link Is Not Secured");
        }
        return firstStepOfSplitting[1]; //  //www.google.com/trading/nifty50
    }

    public static String printDomainName(String str2) {

          //www.google.com/trading/nifty50
        String[] secondStepOfSplitting = str2.split("/");
//        for (int i = 0; i < secondStepOfSplitting.length; i++) {
        System.out.println(secondStepOfSplitting[2]);
        System.out.println(secondStepOfSplitting.length);

//        }
        return secondStepOfSplitting[2]; // www.google.com
    }

    private static void checkCountryBelong(String str3) {

        // www.google.com
        String[] thirdStepOfSplitting = str3.split("[.]");
        System.out.println(thirdStepOfSplitting.length);
        if(thirdStepOfSplitting.length == 3){
            System.out.println(thirdStepOfSplitting[2]);
            if (thirdStepOfSplitting[2].equals("com")) {
                System.out.println(".com is Global Commercial");
            } else if (thirdStepOfSplitting[2].equals("org")) {
                System.out.println(".org is Organisation");
            }else{
                System.out.println(thirdStepOfSplitting[2]+": Unknown Company");
            }
        }else if(thirdStepOfSplitting.length == 4){
            if(thirdStepOfSplitting[3]==null && !thirdStepOfSplitting[3].isEmpty()){
                return;
            }

            if (thirdStepOfSplitting[3].equals("in")) {
                System.out.println(".com.in is Indian Country");
            } else if (thirdStepOfSplitting[3].equals("uk")) {
                System.out.println(".co.uk is uk Based Country");
            } else{
                System.out.println(thirdStepOfSplitting[3]+" is not registered country");
            }
        }
    }

}


