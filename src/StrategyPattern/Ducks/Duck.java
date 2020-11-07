/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyPattern.Ducks;

import StrategyPattern.Fly.FlyBehavior;
import StrategyPattern.Quack.QuackBehavior;

/**
 *
 * @author DELL
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    
    public Duck(){
    }
    
    public void performQuack(){
        this.quackBehavior.quack();
    }
    
    public void performFly(){
        this.flyBehavior.fly();
    }
    
    public void swim(){
        System.out.println("Swimming");
    }
    
    public void display(){ 
    }
    
    public void setFlyBehavior(FlyBehavior flyBe){
        this.flyBehavior = flyBe;
    } 
    
    public void setQuackBehavior(QuackBehavior quackBe){
        this.quackBehavior = quackBe;
    } 
    
}
