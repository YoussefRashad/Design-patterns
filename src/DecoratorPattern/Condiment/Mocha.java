/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecoratorPattern.Condiment;

import DecoratorPattern.Beverage;
import DecoratorPattern.CondimentDecorator;

/**
 *
 * @author DELL
 */
public class Mocha extends CondimentDecorator{
    Beverage beverage;
    
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    
    @Override
    public String getDesc() {
        return this.beverage.getDesc() + ", Mocha";
    }

    @Override
    public double cost() {
        return 3 + this.beverage.cost();
    }
    
}
