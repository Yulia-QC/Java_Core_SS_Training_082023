package org.example.Homework13;

public class Engine implements Runnable {
    private CarBuilder carBuilder;

    public Engine(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        carBuilder.addToComponentQueue(this);
    }
}
