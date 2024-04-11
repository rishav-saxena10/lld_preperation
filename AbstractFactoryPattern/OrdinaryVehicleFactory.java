package lld_preperation.AbstractFactoryPattern;

public class OrdinaryVehicleFactory implements VehicleFactory {
    public Vehicle getVehicleInstance(String vehicleType) {
        switch (vehicleType) {
            case "OrdinaryVehicle1":
                return new OrdinaryVehicle1();
            case "OrdinaryVehicle2":
                return new OrdinaryVehicle2();
            default:
                System.out.println("Invalid Ordinary Vehicle Type");
                return null;
        }
    }
}
