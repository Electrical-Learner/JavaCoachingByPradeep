package org.example.exception.weatherException;

public class AgeValidationException extends Exception{
    public AgeValidationException(String msg){   //Parameterized Constructor
        super(msg);
        System.out.println(msg);
    }
    public AgeValidationException(){     //Default Constructor
        super("Not allowed for voting");
        System.out.println("Not allowed for voting");
    }
}
