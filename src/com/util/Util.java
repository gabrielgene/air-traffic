package com.util;

import com.data.FlightStatus;
import com.data.Model;

import java.util.HashMap;
import java.util.Random;

public class Util {

    private static Object getRandomValueFromMap(final HashMap map) {
        final Random generator = new Random();
        final Object[] values = map.values().toArray();
        return values[generator.nextInt(values.length)];
    }

    public static FlightStatus getRandomStatus() {
        final HashMap<Object, Object> status = new HashMap<>();
        status.put(0, new FlightStatus("Preflight", "Takeoff")); //Esta é a parte do vôo em que o avião ainda está no chão
        status.put(1, new FlightStatus("Takeoff", "Departure")); //O piloto acelera a aeronave na pista
        status.put(2, new FlightStatus("Departure", "En route"));//O avião levanta do chão e sobe para uma altitude consideravel
        status.put(3, new FlightStatus("En route", "Descent"));//A aeronave viaja através de um ou mais espaços aéreos
        status.put(4, new FlightStatus("Descent", "Approach"));//O piloto desce e manobra para o aeroporto de destino
        status.put(5, new FlightStatus("Approach", "Landing"));//O piloto alinha a aeronave com a pista de pouso designada
        status.put(6, new FlightStatus("Landing", ""));//A aeronae aterra na pista e para no terminal de destino.
        return (FlightStatus) getRandomValueFromMap(status);
    }

    public static Model getRandomModel() {
        final HashMap<Object, Object> models = new HashMap<>();
        models.put(0, new Model("ATR 42-500", "20/02/2014"));
        models.put(1, new Model("Airbus A320", "17/04/2013"));
        models.put(2, new Model("Embraer 175", "03/08/2015"));
        models.put(3, new Model("Boeing 737-700", "30/06/2017"));
        return (Model) getRandomValueFromMap(models);
    }
}
