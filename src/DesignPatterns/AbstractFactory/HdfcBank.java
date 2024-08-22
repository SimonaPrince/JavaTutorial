package DesignPatterns.AbstractFactory;

public class HdfcBank implements Bank {
    private final String bname;
    public HdfcBank(){
        this.bname = "HDFC Bank";
    }

    @Override
    public String getBank() {
        return bname;
    }
}
