/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyPattern.Ducks;

import StrategyPattern.Fly.FlyWithWings;
import StrategyPattern.Quack.Quack;

/**
 *
 * @author DELL
 */
public class RedheadDuck extends Duck{

    public RedheadDuck() {
        System.out.println("Redhead Duck Constructor");
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }
    
    public void display(){
        System.out.println("RedheadDuck");
    }
}
