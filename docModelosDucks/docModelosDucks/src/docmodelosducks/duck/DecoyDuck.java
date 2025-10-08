/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docmodelosducks.duck;

import FlyBehaviors.FlyBehavior;
import FlyBehaviors.FlyNoWay;
import QuackBehaviors.MuteQuack;
import QuackBehaviors.QuackBehavior;


/**
 *
 * @author Estudiantes
 */
public class DecoyDuck extends Duck {
    

    
    public DecoyDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new MuteQuack();
    }

    
    @Override
    public void display() {
    }
    
}
