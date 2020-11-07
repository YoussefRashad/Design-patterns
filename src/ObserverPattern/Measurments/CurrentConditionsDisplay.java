/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverPattern.Measurments;

import ObserverPattern.DisplayElement;
import ObserverPattern.Observer;
import ObserverPattern.Subject;

/**
 *
 * @author DELL
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private float tempreature;
    private float humidity;    
    private float pressure;
    private Subject weatherData;
    
    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.tempreature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + this.tempreature + "F degrees and " + this.humidity + "% humidity");
    }
}
