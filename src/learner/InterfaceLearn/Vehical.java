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
public interface Vehical {// No need to use "abstract" any more as shown below. interface are abstract by default
//public abstract interface Vehical {

    // declaration
    public static final int SET1 = 1;
    int SET2 = 2;//public static final  BY DEFAULT

    public abstract void changeGear(int newValue);

    void speedUp(int increment);//method are always public and abstract by default

    void applyBrakes(int decrement);
}
