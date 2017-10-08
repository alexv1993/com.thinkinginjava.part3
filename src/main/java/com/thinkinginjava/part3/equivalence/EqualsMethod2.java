package com.thinkinginjava.part3.equivalence;

/**
 * Created by Alex on 08.10.2017.
 */
public class EqualsMethod2 {
    public static void main(String[] args) {
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        System.out.println(v1.equals(v2));
    }

}
