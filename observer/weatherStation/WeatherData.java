package com.observer.weatherStation;

import java.util.Collections;
import java.util.List;

public class WeatherData implements Subject {
    private float temperature;
    private float humidity;
    private List<Observer> observers;

    public WeatherData() {
        observers = Collections.emptyList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i>=0) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        for(Observer obs: observers) {
            obs.update(temperature, humidity);
        }
    }

    public void measurementChanged() {
        notifyObserver();
    }

    public void setMeasurement(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        // update value as you want. Can add more functionality like only call update when change is x%
        measurementChanged();
    }

    // Getters
}
