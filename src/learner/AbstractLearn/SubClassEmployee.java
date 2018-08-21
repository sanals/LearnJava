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
public class SubClassEmployee extends AbstractSubClassMan {

    private int empId;

    public SubClassEmployee(String nm, String gen, int id) {
        super(nm, gen);
        this.empId = id;
    }

    @Override
    public void work() {
        if (empId == 0) {
            System.out.println("Not working");
        } else {
            System.out.println("Working as employee!!");
        }
    }
    
    public static void main(String args[]) {
        //coding in terms of abstract classes
        AbstractPerson employee = new SubClassEmployee("Pankaj", "Male", 123);
        employee.work();
        //using method implemented in abstract class - inheritance
        System.out.println(employee);//toString() function called by default since it is overridden
        employee.changeName("Pankaj Kumar");
        System.out.println(employee);//toString() function called by default since it is overridden
    }

    @Override
    public void workMen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
