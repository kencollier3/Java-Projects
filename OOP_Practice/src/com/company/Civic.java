package com.company;

public class Civic extends Car {
    private int roadServiceMonths;

    public Civic(String currentDirection, int doors, int wheels, String model, String engine, String color, int roadServiceMonths) {
        super("Civic", "Hatchback", currentDirection, doors, wheels, model, engine, color);
        this.roadServiceMonths = roadServiceMonths;
    }
}
