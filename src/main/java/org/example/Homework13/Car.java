package org.example.Homework13;

import java.io.Serializable;

public class Car implements Serializable {
    private static final long serialVersionUID = 1L;
    private final int tires;
    private final int seats;
    private final int engine;
    private final int frame;

    public Car(int tires, int seats, int engine, int frame) {
        this.tires = tires;
        this.seats = seats;
        this.engine = engine;
        this.frame = frame;
    }

    public int getTires() {
        return tires;
    }

    public int getSeats() {
        return seats;
    }

    public int getEngine() {
        return engine;
    }

    public int getFrame() {
        return frame;
    }
    @Override
    public String toString() {
        return "Car{" +
                "tires=" + tires +
                ", seats=" + seats +
                ", engine=" + engine +
                ", frame=" + frame +
                '}';
    }
}
