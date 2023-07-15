package org.example.exception.weatherException;

public class WeatherReport {
    public static void main(String[] args) {
        try {
            getWeatherReport(true);
        } catch (Exception e) {
            System.out.println("Caught Exception" + e);
        }
    }


    public static  String getWeatherReport(Boolean weather) throws CheckWeatherException {
        if (weather == true) {
            System.out.println("Weather is good");
            try{
                new WeatherReport().getCondition(true);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            return null;
        } else {
            new WeatherReport().getCondition(false);
            throw new CheckWeatherException("Weather is not good");
        }
    }

    public String getCondition(Boolean check) {
        if(check==true){
            System.out.println("let's play cricket");
        }else{
            System.out.println("we can't play");
        }
        return null;
    }
}
