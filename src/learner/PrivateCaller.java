/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learner;

import java.lang.reflect.Method;

/**
 *
 * @author pc4
 */
class PrivateCaller {

    private void a() {
        System.out.println("private of A called");
    }
}

class B extends PrivateCaller {

    public void callAa() {
        try {
//            Method m_s[] = getClass().getSuperclass().getDeclaredMethods();
//            for (Method m_ : m_s) {
//                m_.setAccessible(true);
//                m_.invoke(this, (Object[]) null);
//            }
            Method m = getClass().getSuperclass().getDeclaredMethod("a", new Class<?>[]{});
            m.setAccessible(true);
            m.invoke(this, (Object[]) null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new B().callAa();
    }
}
