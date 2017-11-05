package com.app;

import com.data.Flight;
import com.util.Util;

public class Main {

    public static void main(String[] args) {
        System.out.println("Air Traffic Controll Simulator");

        final Flight flight1 = new Flight(Util.getRandomStatus(), Util.getRandomModel());
        final Flight flight2 = new Flight(Util.getRandomStatus(), Util.getRandomModel());


        flight1.about();
        flight2.about();
    }
}
