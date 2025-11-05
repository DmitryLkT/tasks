package org.LukDT.Task_2;

import java.util.ArrayList;
import java.util.Arrays;

public class A_And_B {
    String maximizationA(String A, String B) {
        int[] listB = new int[B.length()];

        for(int i = 0; i < B.length(); i++) {
            listB[i] = (B.charAt(i) - '0');
        }

        Arrays.sort(listB);
        int incr = listB.length - 1;

        StringBuilder result = new StringBuilder(A);

        for(int i = 0; i < A.length(); i++) {
            if(incr < 0) break;
            int current = A.charAt(i) - '0';
            int best = listB[incr];

            if(best > current) {
                result.setCharAt(i, (char) (best + '0'));
                incr--;
            }
        }
        return result.toString();
    }
}
