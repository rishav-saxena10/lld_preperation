package AbstractFactoryPattern;

public interface VehicleFactory {
    public Vehicle getVehicleInstance(String vehicleType);
}
