package org.example.exception.weatherException;

public class CustomExceptionExecution{
    public static void main(String[]  args){
        try{
            getAgeValidation(Integer.parseInt(args[0]));
        } catch(AgeValidationException e){
            System.out.println("AgeValidationException" + e);
        }
    }

    public static String getAgeValidation(int age) throws AgeValidationException {
        if(age > 18){
            System.out.println("Allowed for voting");
            return null;
        } else{
            throw new AgeValidationException("Eligible but allowed after 18");
        }
    }
}
