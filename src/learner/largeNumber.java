/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author pc4
 */
public class largeNumber {
    
    public static void main(String[] args) throws IOException {
        new largeNumber().main_method();
    }

    int main_method() throws IOException {
        int t;
        int[] a = new int[200]; //array will have the capacity to store 200 digits.
        int n, i, j, temp, m, x;
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferRead.readLine();
        t = Integer.parseInt(s);
        while (t >= 0) {
            BufferedReader bufferReadInner = new BufferedReader(new InputStreamReader(System.in));
            String s_inner = bufferReadInner.readLine();
            n = Integer.parseInt(s_inner);
            a[0] = 1;  //initializes array with only 1 digit, the digit 1.
            m = 1;    // initializes digit counter

            temp = 0; //Initializes carry variable to 0.
            for (i = 1; i <= n; i++) {
                for (j = 0; j < m; j++) {
                    x = a[j] * i + temp; //x contains the digit by digit product
                    a[j] = x % 10; //Contains the digit to store in position j
                    temp = x / 10; //Contains the carry value that will be stored on later indexes
                }
                while (temp > 0) //while loop that will store the carry value on array.
                {
                    a[m] = temp % 10;
                    temp = temp / 10;
                    m++; // increments digit counter
                }
            }
            for (i = m - 1; i >= 0; i--) //printing answer
            {
                System.out.printf("%d", a[i]);
            }
            System.out.printf("\n");
        }
        return 0;
    }
}
