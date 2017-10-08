package com.thinkinginjava.part3.passObject;

/**
 * Created by Alex on 08.10.2017.
 */
public class PassObject {
    public static void main(String[] args) {
        new PassObject().doForLetter();
        new PassObject().doForNumber();
    }


    private void doForNumber() {
        Number number = new Number();
        number.num = 13234.54354f;
        System.out.println("1: number.num: " + number.num);
        f(number);
        System.out.println("2: number.num: " + number.num);
    }

    public void doForLetter() {
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("1: x.c: " + x.c);
        f(x);
        System.out.println("2: x.c: " + x.c);
    }

    static void f(Letter y) {
        y.c = 'z';
    }

    static void f(Number number) {
        number.num = 43.5f;
    }

}
