package com.thinkinginjava.part3.assignment;

/**
 * Created by Alex on 08.10.2017.
 */
public class Assignment2 {
    public static void main(String[] args) {
        Art art1 = new Art();
        Art art2 = new Art();

        art1.distance = 2000;
        art2.distance = 2500;

        System.out.println("1: art1.distance: " + art1.distance + " art2.distance: " + art2.distance);

        art1 = art2;

        System.out.println("2: art1.distance: " + art1.distance + " art2.distance: " + art2.distance);

        art1.distance = 3000;

        System.out.println("3: art1.distance: " + art1.distance + " art2.distance: " + art2.distance);


    }

}
