package lld_preperation.AbstractFactoryPattern;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory1 = new OrdinaryVehicleFactory();
        VehicleFactory vehicleFactory2 = new LuxuryVehicleFactory();
        
        Vehicle vehicle1 = vehicleFactory1.getVehicleInstance("OrdinaryVehicle1");
        vehicle1.drive();

        Vehicle vehicle2 = vehicleFactory1.getVehicleInstance("OrdinaryVehicle2");
        vehicle2.drive();

        Vehicle vehicle3 = vehicleFactory2.getVehicleInstance("LuxuryVehicle1");
        vehicle3.drive();

        Vehicle vehicle4 = vehicleFactory2.getVehicleInstance("LuxuryVehicle2");
        vehicle4.drive();
    }
}
