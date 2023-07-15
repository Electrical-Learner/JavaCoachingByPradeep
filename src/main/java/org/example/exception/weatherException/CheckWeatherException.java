package org.example.exception.weatherException;

public class CheckWeatherException extends Exception {
    public CheckWeatherException(String msg){
        super(msg);
        System.out.println(msg);
    }
}
