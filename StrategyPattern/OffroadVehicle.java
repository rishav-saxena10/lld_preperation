package StrategyPattern;
import StrategyPattern.Strategy.SportsDriveStrategy;

public class OffroadVehicle extends Vehicle {
    public OffroadVehicle() {
        super(new SportsDriveStrategy());
    }
}
