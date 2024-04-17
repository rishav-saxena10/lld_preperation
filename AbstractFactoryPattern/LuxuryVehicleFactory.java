package AbstractFactoryPattern;

public class LuxuryVehicleFactory implements VehicleFactory {
    public Vehicle getVehicleInstance(String vehicleType) {
        switch(vehicleType) {
            case "LuxuryVehicle1":
                return new LuxuryVehicle1();
            case "LuxuryVehicle2":
                return new LuxuryVehicle2();
            default:
                System.out.println("Invalid luxury vehicle type");
                return null;
        }
    }
}
