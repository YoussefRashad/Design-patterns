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
public class DarkRoast extends Beverage {
    public DarkRoast(){
        this.desc = "DarkRoast";
    }
    
    @Override
    public double cost() {
        return 7.3;
    }
}
