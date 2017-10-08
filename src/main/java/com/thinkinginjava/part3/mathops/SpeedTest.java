package com.thinkinginjava.part3.mathops;

import java.util.Random;

/**
 * Created by Alex on 08.10.2017.
 */
public class SpeedTest {
    public static void main(String[] args) {
        Random random = new Random();

        double time = random.nextDouble() * 10;
        System.out.println("time " + time + " hours ");

        double S = random.nextDouble() * 100;
        System.out.println("s " + S + " meters ");

        double speed = S / time;

        System.out.println("speed: " + speed + " meters in hour");
    }
}
