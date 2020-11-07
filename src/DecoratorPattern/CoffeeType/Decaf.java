/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecoratorPattern.CoffeeType;

import DecoratorPattern.Beverage;

/**
 *
 * @author DELL
 */
public class Decaf extends Beverage {
    public Decaf(){
        this.desc = "Decaf";
    }
    
    @Override
    public double cost() {
        return 5;
    }
}
