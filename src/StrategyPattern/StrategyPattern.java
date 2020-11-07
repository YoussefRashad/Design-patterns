/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyPattern;

import Ducks.*;
import Fly.*;
import Quack.*;


public class StrategyPattern {

    public static void main(String[] args) {
        // TODO code application logic here
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
        
        System.out.println("");
        
        Duck model = new RedheadDuck();
        model.display();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        
        System.out.println("");


        Duck model2 = new RubberDuck();
        model2.display();
        model2.performQuack();
        model2.setQuackBehavior(new Squeak());
        model2.performQuack();
        
    }
    
}
