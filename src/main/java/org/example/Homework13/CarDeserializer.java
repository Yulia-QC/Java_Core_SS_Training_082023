package org.example.Homework13;

import java.io.*;

public class CarDeserializer {
    public static void main(String[] args) {
        String filePath = "car.ser";

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            Car car = (Car) inputStream.readObject();
            System.out.println("Deserialized Car: " + car);

            // Access and use the attributes of the deserialized car
            int numberOfTires = car.getTires();
            int numberOfSeats = car.getSeats();
            int numberOfEngines = car.getEngine();
            int numberOfFrames = car.getFrame();

            System.out.println("Number of Tires: " + numberOfTires);
            System.out.println("Number of Seats: " + numberOfSeats);
            System.out.println("Number of Engines: " + numberOfEngines);
            System.out.println("Number of Frames: " + numberOfFrames);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}



