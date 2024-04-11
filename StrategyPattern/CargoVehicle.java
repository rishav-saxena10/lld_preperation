package lld_preperation.StrategyPattern;
import lld_preperation.StrategyPattern.Strategy.BulletDriveStartegy;

public class CargoVehicle extends Vehicle {

    public CargoVehicle() {
        super(new BulletDriveStartegy());
    }
}
