package Java.Polimorfism;

public class OutSourcedEmployee extends Employee{

    private Double aditionalCharge;

    public OutSourcedEmployee() {
        super();
    }

    public OutSourcedEmployee(String name, Integer hour, Double valuePerHOur, Double aditionalCharge) {
        super(name, hour, valuePerHOur);
        this.aditionalCharge = aditionalCharge;
    }

    public Double getAditionalCharge() {
        return aditionalCharge;
    }

    public void setAditionalCharge(Double aditionalCharge) {
        this.aditionalCharge = aditionalCharge;
    }

    @Override
    public Double payment(){
        return super.payment() + aditionalCharge * 1.1;
    }

}
