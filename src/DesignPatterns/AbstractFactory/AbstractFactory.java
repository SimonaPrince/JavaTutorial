package DesignPatterns.AbstractFactory;

abstract class AbstractFactory {
    public abstract Bank getBank(String name);

    public abstract Loan getLoan(String Loan);
}
