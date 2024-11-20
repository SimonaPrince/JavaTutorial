package DesignPatterns.AbstractFactory;

abstract class AbstractFactory {

    public abstract Bank getBank(String BankName);
    public abstract Loan getLoan(String LoanName);

}
