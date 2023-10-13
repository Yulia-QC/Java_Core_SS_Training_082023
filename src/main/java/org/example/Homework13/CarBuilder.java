package org.example.Homework13;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.concurrent.*;


public class CarBuilder {
    private BlockingQueue<Object> componentQueue = new LinkedBlockingQueue<>();
    private final int requiredTires = 4;
    private final int requiredSeats = 5;
    private final int requiredEngine = 1;
    private final int requiredFrame = 1;

    private int tiresBuilt = 0;
    private int seatsBuilt = 0;
    private int enginesBuilt = 0;
    private int framesBuilt = 0;

    public synchronized void componentBuilt(Component component) {
        switch (component) {
            case TIRE:
                tiresBuilt++;
                break;
            case SEATS:
                seatsBuilt++;
                break;
            case ENGINE:
                enginesBuilt++;
                break;
            case FRAME:
                framesBuilt++;
                break;
        }
    }
    public void buildComponents() {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < requiredTires; i++) {
            executor.execute(new CarComponent(Component.TIRE, this));
        }
        for (int i = 0; i < requiredSeats; i++) {
            executor.execute(new CarComponent(Component.SEATS, this));
        }
        for (int i = 0; i < requiredEngine; i++) {
            executor.execute(new CarComponent(Component.ENGINE, this));
        }
        for (int i = 0; i < requiredFrame; i++) {
            executor.execute(new CarComponent(Component.FRAME, this));
        }

        executor.shutdown();

        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
            assembleCar();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized void addToComponentQueue(Object component) {
        componentQueue.add(component);
    }

    private void assembleCar() {
        while (tiresBuilt < requiredTires || seatsBuilt < requiredSeats ||
                enginesBuilt < requiredEngine || framesBuilt < requiredFrame) {
            // Wait until all components are built
        }

        Car car = new Car(tiresBuilt, seatsBuilt, enginesBuilt, framesBuilt);


        String filePath = "car.ser";
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            outputStream.writeObject(car);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();
        carBuilder.buildComponents();
    }
}

