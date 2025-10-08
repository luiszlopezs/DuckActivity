
import FlyBehaviors.FlyRocketPowered;
import docmodelosducks.duck.MallardDuck;
import docmodelosducks.duck.RubberDuck;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Estudiantes
 */
public class Main {

    public static void main(String[] args) {
        RubberDuck patoReal = new RubberDuck();
        patoReal.display();
        patoReal.performQuack();
        patoReal.performFly();

        patoReal.setFlyBehavior(new FlyRocketPowered());

        patoReal.performFly();
    }
}
