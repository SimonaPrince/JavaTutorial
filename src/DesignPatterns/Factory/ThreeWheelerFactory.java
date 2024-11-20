package DesignPatterns.Factory;

public class ThreeWheelerFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new ThreeWheeler();
    }
}
