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
public class Whip extends CondimentDecorator{
    Beverage beverage;
    
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    
    @Override
    public String getDesc() {
        return this.beverage.getDesc() + ", Whip";
    }

    @Override
    public double cost() {
        return 1.2 + this.beverage.cost();
    }
}
