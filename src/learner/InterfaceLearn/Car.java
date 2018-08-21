/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learner.InterfaceLearn;

/**
 *
 * @author pc4
 */
public class Car implements Vehical {

    int speed = 0;
    int gear = 1;
    // implementation

    @Override
    public void changeGear(int newValue) {
        gear = newValue;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        System.out.println(" speed:" + speed + " gear:" + gear);
    }
}
