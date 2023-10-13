package org.example.Homework13;

public class Frame implements Runnable {
    private CarBuilder carBuilder;

    public Frame(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        carBuilder.addToComponentQueue(this);
    }
}
