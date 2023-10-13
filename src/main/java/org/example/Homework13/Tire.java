package org.example.Homework13;

public class Tire implements Runnable {
    private CarBuilder carBuilder;

    public Tire(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        carBuilder.addToComponentQueue(this);
    }
}
