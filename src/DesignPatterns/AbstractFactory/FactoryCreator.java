package DesignPatterns.AbstractFactory;

public class FactoryCreator {
    public static AbstractFactory getFactory(String type){
        if(type == "Bank"){
            return new BankFactory();
        }
        if(type == "Loan"){
            return new LoanFactory();
        }
        return null;
    }
}
