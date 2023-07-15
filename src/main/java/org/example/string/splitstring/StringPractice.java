package org.example.string.splitstring;

public class StringPractice {
    public static void main(String[] args) {

        String url = "https://www.google.com/Image/abcd.jpeg";
        //Storing the string value in "url" variable
        String[] companyNameArray = url.split("//");
        //splitting the value stored in "url" variable by "//" and storing it in "companyNameArray"
        System.out.println("----------companyNameArray" + "\n" + "Length=" + companyNameArray.length);
        // printing content(Splited from url string)
        for (int i = 0; i < companyNameArray.length; i++) { //  i=2, companyNameArray.length=2
            System.out.println("companyNameArray[" + i + "]-" + companyNameArray[i]);
        }
        System.out.println("----------End Of companyNameArray");
        System.out.println();


        String[] splitArray = companyNameArray[1].split("/");
        //splitting the value stored in "companyNameArray[1]" variable by "/" and Storing it in the "splitArray"
        System.out.println("---------splitArray" + "\n" + "length=" + splitArray.length);
        //print  all three indexes ( splited from companyNameArray[1])
        for (int i = 0; i < splitArray.length; i++) { //  i=3, splitArray.length=3
            System.out.println("splitArray[" + i + "]-" + splitArray[i]);
        }
        System.out.print("---------End Of splitArray");
        System.out.println();


        String[] nameArray = splitArray[0].split("[.]");  // "." will give no output, rewrite it as "[.]"
        // splitting the value stored in a variable "splitArray[0]" by "."
        System.out.println("---------nameArray" + "\n" + "Length=" + splitArray.length);
        //print all 3 indexes (Splited from splitArray)
        for (int i = 0; i < nameArray.length; i++) {
            System.out.println("nameArray[" + i + "]-" + nameArray[i]);
        }
        System.out.println("---------End Of nameArray");
        System.out.println();

        System.out.println("---------");
        System.out.println("Output");
        System.out.println("Company Name is :" + nameArray[1]);
        System.out.println("file Name is :" + splitArray[2]);
        System.out.println("---------");
    }
}

