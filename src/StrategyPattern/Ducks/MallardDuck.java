/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyPattern.Ducks;

import StrategyPattern.Fly.FlyNoWay;
import StrategyPattern.Quack.MuteQuack;

/**
 *
 * @author DELL
 */
public class MallardDuck extends Duck{
    public MallardDuck(){
        System.out.println("Mallard Duck Constructor");
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new MuteQuack();
    }
    public void display(){
        System.out.println("MallardDuck");
    }
}
