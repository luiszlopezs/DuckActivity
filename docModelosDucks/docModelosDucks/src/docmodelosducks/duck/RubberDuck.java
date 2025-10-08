/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docmodelosducks.duck;

import FlyBehaviors.FlyNoWay;
import FlyBehaviors.FlyRocketPowered;
import QuackBehaviors.MuteQuack;
import QuackBehaviors.Squeak;
import docmodelosducks.duck.Duck;

/**
 *
 * @author Estudiantes
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Squeak();
    }
    


    @Override
    public void display() {
        System.out.println("patito amarillo");
    }

}
