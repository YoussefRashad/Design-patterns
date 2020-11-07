/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecoratorPattern;

/**
 *
 * @author DELL
 */
public abstract class Beverage {
    public String desc = "Unknown Beverage";
    
    public String getDesc(){
        return this.desc;
    }
    public abstract double cost();
}
