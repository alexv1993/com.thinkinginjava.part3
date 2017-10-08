package com.thinkinginjava.part3.mathops;

import java.util.Random;

/**
 * Created by Alex on 08.10.2017.
 */
public class MathOps {
    public static void main(String[] args) {
        Random rand = new Random();
        int i, j, k;
        j = rand.nextInt(100) + 1;
        System.out.println("j: " + j);
        k = rand.nextInt(100) + 1;
        System.out.println("k: " + k);
        i = j + k;
        System.out.println("j + k: " + i);
        i = j - k;
        System.out.println("j - k: " + i);
        i = k / j;
        System.out.println("k / j: " + i);
        i = k * j;
        System.out.println("k * j: " + i);
        i = k % j;
        System.out.println("k % j: " + i);
        j %= k;
        System.out.println("j %/ k: " + j);

        float u, v, w;
        v = rand.nextFloat();
        System.out.println("v: " + v);
        w = rand.nextFloat();
        System.out.println("w: " + w);
        u = v + w;
        System.out.println("v + w: " + u);
        u = v - w;
        System.out.println("v - w: " + u);
        u = v * w;
        System.out.println("v*w: " + u);
        u = v / w;
        System.out.println("v/w: " + u);

        u += v;
        System.out.println("u+= v: " + u);
        u -= v;
        System.out.println("u-= v: " + u);
        u *= v;
        System.out.println("u*= v:" + u);
        u /= v;
        System.out.println("u/= v:" + u);
    }
}
