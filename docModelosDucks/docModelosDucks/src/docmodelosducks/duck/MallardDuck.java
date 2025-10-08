/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docmodelosducks.duck;

import FlyBehaviors.FlyNoWay;
import FlyBehaviors.FlyWithWings;
import QuackBehaviors.MuteQuack;
import QuackBehaviors.Quack;
import docmodelosducks.duck.Duck;

/**
 *
 * @author Estudiantes
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("soy un pato real, quack");
    }

}
