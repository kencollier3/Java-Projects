package com.company;

public class Car extends Vehicle {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public Car(String name, String size, String currentDirection, int doors, int wheels, String model, String engine, String color) {
        super(name, size, currentDirection);
        this.doors = doors;
        this.wheels = wheels;
        this.model = model;
        this.engine = engine;
        this.color = color;
    }

    public void changeVelocity(int speed, String direction) {
        move(speed, direction);
        System.out.println("Car. changeVelocity() " + speed + " direction " + direction);
    }

    public int getDoors() {
        return doors;
    }

    public int getWheels() {
        return wheels;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }
}
