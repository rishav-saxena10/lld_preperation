package lld_preperation.StrategyPattern.Strategy;
public class NormalDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Normal Drive Capability");
    }
}
