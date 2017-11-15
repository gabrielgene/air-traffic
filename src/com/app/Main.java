package com.app;


import com.data.Flight;

public class Main {

  public static void main(String[] args) {
    System.out.println("Air Traffic Controll Simulator");

    Flight flight1 = new Flight();
    flight1.about();
    try {
      flight1.nextStatus();
      flight1.nextStatus();
      flight1.nextStatus();
      flight1.nextStatus();
      flight1.nextStatus();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
