package StrategyPattern.Strategy;

public class BulletDriveStrategy implements DriveStrategy {
    public void drive() {
        System.out.println("Bullet Drive Capability");
    }
}
