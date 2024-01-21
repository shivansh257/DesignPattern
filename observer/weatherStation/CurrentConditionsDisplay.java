package com.observer.weatherStation;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    float temperature;
    float humidity;
    private final Subject weatherData;

    CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity) {     // data is being pushed by the subject
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Print the data");
    }
}
