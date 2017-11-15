package com.data;


import java.util.ArrayList;
import java.util.Arrays;

public class Status {
  private static final ArrayList<String> status;

  static {
    status = new ArrayList<>(Arrays.asList(
            "Preflight",//Esta é a parte do vôo em que o avião ainda está no chão
            "Takeoff", //O piloto acelera a aeronave na pista
            "Departure",//O avião levanta do chão e sobe para uma altitude consideravel
            "En route",//A aeronave viaja através de um ou mais espaços aéreos
            "Descent",//O piloto desce e manobra para o aeroporto de destino
            "Approach",//O piloto alinha a aeronave com a pista de pouso designada
            "Landing"//A aeronae aterra na pista e para no terminal de destino.
    ));
  }

  public static int getStatusSize() {
    return status.size();
  }

  public static String getStatus(final Integer index) {
    if (index >= getStatusSize()) {
      return status.get(6);
    }
    return status.get(index);
  }
}
