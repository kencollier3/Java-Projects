package com.company;

public class Vehicle {
    private String name;
    private String size;

    private int currentVelocity;
    private String currentDirection;

    public Vehicle(String name, String size, String currentDirection) {
        this.name = name;
        this.size = size;
        this.currentDirection = currentDirection;
        this.currentVelocity = 0;
    }

    public void steer(String direction) {
        this.currentDirection = direction;
        System.out.println("Vehicle steer() " + direction);
    }

    public void move(int velocity, String direction) {
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Moving " + velocity + " heading " + direction);
    }

    public void stop() {
        this.currentVelocity = 0;
    }
    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public String getCurrentDirection() {
        return currentDirection;
    }
}
