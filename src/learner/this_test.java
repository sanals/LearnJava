/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learner;

/**
 *
 * @author pc4
 */
public class this_test {

    void getThisHere(String... params) {//Varargs OR variable arguments.
        System.out.println(params[0] + params[1]);
    }

    public static void main(String[] args) {
        new this_test().getThisHere("1", "2");
        Status c1 = Status.ACTIVE;
        System.out.println(c1);

        new this_test().main();
    }
    int factorial(int N) {
        int ans = 1;
        int i;
        for (i = 1; i <= N; i++) {
            ans *= i;
        }
        return ans;
    }

    int main() {
        int t;
        for (t = 1; t <= 34; t++) {
            System.out.printf("%d\n", factorial(t));
        }
        return 0;
    }

    enum Status {
        ACTIVE, INACTIVE;
    }
}
