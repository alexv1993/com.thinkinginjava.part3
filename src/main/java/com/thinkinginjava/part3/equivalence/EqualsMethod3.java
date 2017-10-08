package com.thinkinginjava.part3.equivalence;

/**
 * Created by Alex on 08.10.2017.
 */
public class EqualsMethod3 {
    public static void main(String[] args) {
        Value2 value2 = new Value2();
        Value2 value21 = new Value2();

        value2.i = value21.i = 100;
        System.out.println(value2.equals(value21));
    }
}
