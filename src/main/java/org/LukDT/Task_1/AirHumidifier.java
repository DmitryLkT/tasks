package org.LukDT.Task_1;

import java.util.Scanner;

public class AirHumidifier {
    int function(String str) {
        Scanner scan = new Scanner(str);
        int N = scan.nextInt();

        int time = 0;
        int water = 0;

        for(int i = 0; i < N; i++) {
            int T = scan.nextInt();
            int V = scan.nextInt();

            int timePassed = T - time;
            water = Math.max(0, water - timePassed);
            water += V;

            time = T;
        }

        scan.close();

        return water;
    }
}
