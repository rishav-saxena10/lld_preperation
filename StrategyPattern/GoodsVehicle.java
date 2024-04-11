package lld_preperation.StrategyPattern;
import lld_preperation.StrategyPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle  {

    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
    
}
