package com.thinkinginjava.part3.equivalence;

/**
 * Created by Alex on 08.10.2017.
 */
public class Equivalence {
    public static void main(String[] args) {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.println(n1 == n2);
        System.out.println(n1 != n2);
    }
}
