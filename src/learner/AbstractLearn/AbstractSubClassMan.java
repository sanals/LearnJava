/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learner.AbstractLearn;

/**
 *
 * @author pc4
 */
public abstract class AbstractSubClassMan extends AbstractPerson {

    private String gender;

    public AbstractSubClassMan(String nm, String gen) {
        super(nm);
        this.gender = gen;
    }

    //abstract method
    public abstract void workMen();

    @Override
    public String toString() {
        return super.toString()+"::Gender=" + this.gender;
    }
}
