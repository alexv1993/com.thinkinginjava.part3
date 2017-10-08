package com.thinkinginjava.part3.equivalence;

import java.util.Objects;

/**
 * Created by Alex on 08.10.2017.
 */
public class Value2 extends Object {
    int i;


    @Override
    public boolean equals(Object obj) {
        Value2 value2 = (Value2) obj;
        if (i == value2.i) {
            return true;
        } else {
            return false;
        }
    }
}
