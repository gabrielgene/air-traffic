package com.data;

public class Flight {
    FlightStatus flightStatus;
    final Model model;

    public Flight(FlightStatus flightStatus, final Model model) {
        this.flightStatus = flightStatus;
        this.model = model;
    }

    public void getStatus() {
        System.out.println(this.flightStatus);
    }

    public void about() {
        System.out.println(String.format(
                "Airplane model %s factory in %s, %s",
                this.model.getModel(),
                this.model.getFactoryDate(),
                this.flightStatus.getStatus())
        );
    }
}

