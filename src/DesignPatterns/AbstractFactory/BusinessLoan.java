package DesignPatterns.AbstractFactory;

public class BusinessLoan implements Loan {
    @Override
    public double getInterest() {
        return 7.5;
    }
}
