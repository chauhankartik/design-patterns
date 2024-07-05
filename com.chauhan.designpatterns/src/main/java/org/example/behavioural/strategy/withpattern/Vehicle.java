package org.example.behavioural.strategy.withpattern;

import org.example.behavioural.strategy.withpattern.strategy.DriveStrategy;

public class Vehicle {

    private DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        /*
        *  Constructor injection
        * */
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
