package com.company;

public class Main {

    public static void main(String[] args) {
        double totalCentimeters = calcFeetAndInchesToCentimeters(58);
        System.out.println(totalCentimeters);
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        double feetToInches = feet * 12;
        double totalInches = inches + feetToInches;
        double centimeters = totalInches * 2.54;

        if(feet < 0) {
            return -1;
        }
        if(inches < 0 && inches > 12) {
            return -1;
        }
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches < 0 || inches > 12) {
            return -1;
        }
        return inches * 2.54;
    }

}
