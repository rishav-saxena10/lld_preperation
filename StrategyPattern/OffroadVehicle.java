package lld_preperation.StrategyPattern;
import lld_preperation.StrategyPattern.Strategy.SportsDriveStrategy;

public class OffroadVehicle extends Vehicle {
    public OffroadVehicle() {
        super(new SportsDriveStrategy());
    }
}
