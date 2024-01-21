package com.observer.weatherStationObservable;

import lombok.Getter;

import java.util.Observable;

/**
 * Observable-observer has been deprecated. Recommendation is to use PropertyEventListener
 */
@Getter
public class WeatherData extends Observable {
    // Getters
    private float temperature;
    private float humidity;

    public WeatherData() {}

    public void measurementChanged() {
        // no need to call Observer.update() directly
        setChanged();
        notifyObservers();
    }

    public void setMeasurement(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        // update value as you want. Can add more functionality like only call update when change is x%
        measurementChanged();
    }

    // Getters created through lombok
}
