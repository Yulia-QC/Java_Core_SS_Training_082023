package org.example.Homework13;

public class Seats implements Runnable {
    private CarBuilder carBuilder;

    public Seats(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        carBuilder.addToComponentQueue(this);
    }
}
