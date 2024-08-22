package DesignPatterns.AbstractFactory;

public class SbiBank implements Bank {
    private final String bname;

    public SbiBank(){
        this.bname="SBI Bank";
    }

    @Override
    public String getBank() {
        return bname;
    }
}
