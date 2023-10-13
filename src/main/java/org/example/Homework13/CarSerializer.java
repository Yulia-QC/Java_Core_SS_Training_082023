package org.example.Homework13;

import java.io.*;
import java.io.Serializable;

public class CarSerializer {
    public static void main(String[] args) {
        String filePath = "car.ser";

        Car car = new Car(4, 5, 1, 1);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            outputStream.writeObject(car);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
