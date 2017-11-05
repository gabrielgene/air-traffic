package com.util;

import com.data.FlightStatus;
import com.data.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Util {

    private static Object getRandomValueFromMap(final ArrayList list) {
        final Random generator = new Random();
        final Object[] values = list.toArray();
        return values[generator.nextInt(values.length)];
    }

    public static FlightStatus getRandomStatus() {
        final ArrayList<FlightStatus> status = new ArrayList<>();
        status.add(new FlightStatus("Preflight", "Takeoff")); //Esta é a parte do vôo em que o avião ainda está no chão
        status.add(new FlightStatus("Takeoff", "Departure")); //O piloto acelera a aeronave na pista
        status.add(new FlightStatus("Departure", "En route"));//O avião levanta do chão e sobe para uma altitude consideravel
        status.add(new FlightStatus("En route", "Descent"));//A aeronave viaja através de um ou mais espaços aéreos
        status.add(new FlightStatus("Descent", "Approach"));//O piloto desce e manobra para o aeroporto de destino
        status.add(new FlightStatus("Approach", "Landing"));//O piloto alinha a aeronave com a pista de pouso designada
        status.add(new FlightStatus("Landing", ""));//A aeronae aterra na pista e para no terminal de destino.
        return (FlightStatus) getRandomValueFromMap(status);
    }

    public static Model getRandomModel() {
        final ArrayList<Model> models = new ArrayList<>();
        models.add(new Model("ATR 42-500", "20/02/2014"));
        models.add(new Model("Airbus A320", "17/04/2013"));
        models.add(new Model("Embraer 175", "03/08/2015"));
        models.add(new Model("Boeing 737-700", "30/06/2017"));
        return (Model) getRandomValueFromMap(models);
    }
}
