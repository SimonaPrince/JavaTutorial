package DesignPatterns.AbstractFactory;

public class IciciBank implements Bank{
    private final String bname;

    public IciciBank(){
        this.bname="ICICI Bank";
    }

    @Override
    public String getBank() {
        return bname;
    }
}
