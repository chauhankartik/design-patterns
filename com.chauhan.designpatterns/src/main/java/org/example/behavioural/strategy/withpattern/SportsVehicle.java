package org.example.behavioural.strategy.withpattern;

import org.example.behavioural.strategy.withpattern.strategy.SpecialDriveStrategy;

public class SportsVehicle extends Vehicle {

    public SportsVehicle() {
        super(new SpecialDriveStrategy());
    }
}
