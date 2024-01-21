package com.observer.weatherStation;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        // observer want to subscribe to which category
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        // add other observers if any and their category

        // trigger the change -> we are doing it manually. This could be done by reading some data from some api
        weatherData.setMeasurement(15.5f, 78.0f);
        weatherData.setMeasurement(18.5f, 57.0f);
    }
}
