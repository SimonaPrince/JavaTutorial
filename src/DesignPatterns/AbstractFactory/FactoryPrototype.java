package DesignPatterns.AbstractFactory;

import java.util.Scanner;

public class FactoryPrototype {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Bank:");
        String bank=sc.next();
        System.out.println("Enter the Loan Type:");
        String loanType=sc.next();
        AbstractFactory bankFactory=FactoryCreator.getFactory("BANK");
        bankFactory.getBank(bank);
        AbstractFactory loanFacrory=FactoryCreator.getFactory("LOAN");
        loanFacrory.getLoan(loanType);
    }
}
