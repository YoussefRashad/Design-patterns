/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverPattern;

import ObserverPattern.Measurments.CurrentConditionsDisplay;

/**
 *
 * @author DELL
 */
public class ObserverPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(weatherData);
        
        weatherData.setMeasurements(80, 65, 30.4f);        
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

    }
    
}
