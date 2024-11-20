package DesignPatterns.AbstractFactory;

public class VehicleLoan implements Loan {
    @Override
    public double getInterest() {
        return 9.25;
    }
}
