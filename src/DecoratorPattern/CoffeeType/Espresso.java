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
public class Espresso extends Beverage{

    public Espresso(){
        this.desc = "Espresso";
    }
    
    @Override
    public double cost() {
        return 1.99;
    }
    
}
