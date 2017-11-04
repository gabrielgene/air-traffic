package com.data;


public class FlightStatus {
    private final String status;
    private final String next;

    public FlightStatus(final String status, final String next) {
        this.status = status;
        this.next = next;
    }

    public String getStatus() {
        return status;
    }

    public String getNext() {
        return next;
    }
}
