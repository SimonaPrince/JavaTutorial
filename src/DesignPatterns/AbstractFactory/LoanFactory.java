package DesignPatterns.AbstractFactory;

public class LoanFactory  extends AbstractFactory {


    @Override
    public Bank getBank(String bankName) {
        return null;
    }

    @Override
    public Loan getLoan(String LoanName) {
        if(LoanName == null){
            return null;
        }
        if(LoanName.equalsIgnoreCase("Home")){
            return new HomeLoan();
        } else if(LoanName.equalsIgnoreCase("Business")){
            return new BusinessLoan();
        } else if(LoanName.equalsIgnoreCase("Vehicle")){
            return new VehicleLoan();
        }
        return null;
    }
}


