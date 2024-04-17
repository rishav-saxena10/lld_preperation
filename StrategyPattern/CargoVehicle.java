package StrategyPattern;
import StrategyPattern.Strategy.BulletDriveStrategy;

public class CargoVehicle extends Vehicle {

    public CargoVehicle() {
        super(new BulletDriveStrategy());
    }
}
