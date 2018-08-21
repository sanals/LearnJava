/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learner;

import java.util.Vector;

/**
 *
 * @author pc4
 */
public class LearnVector {

    public static void main(String[] arg) {

        // create default vector
        Vector v = new Vector();

        v.add(0, 1);
        v.add(1, 2);
        v.add(2, "geeks");
        v.add(3, "forGeeks");
        v.add(4, 3);

        System.out.println("Vector is " + v);
        v.add(4, 5);
        System.out.println("Vector is " + v);
        v.insertElementAt(0, 4);
        System.out.println("Vector is " + v);

        Class c = LearnVector.class;
        System.out.println(c.getClassLoader());
        System.out.println(String.class.getClassLoader());
        System.out.println(Object.class.getClassLoader());

    }
}
