package org.example.behavioural.strategy.withpattern.strategy;

public class NormalDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Normal Drive.....");
    }
}
