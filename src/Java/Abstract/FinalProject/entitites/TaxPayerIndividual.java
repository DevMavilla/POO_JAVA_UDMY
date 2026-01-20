package Java.Abstract.FinalProject.entitites;

public class TaxPayerIndividual extends TaxPayers{
    public double healthExpeditures;

    public TaxPayerIndividual(String name, double anualIncome, double healthExpeditures) {
        super(name, anualIncome);
        this.healthExpeditures = healthExpeditures;
    }

    public double getHealthExpeditures() {
        return healthExpeditures;
    }

    public void setHealthExpeditures(double healthExpeditures) {
        this.healthExpeditures = healthExpeditures;
    }

    @Override
    public final Double taxPayment() {

        double taxRate = (20000.0 > getAnualIncome()) ? 0.15 : 0.25;
        double grossTax = getAnualIncome() * taxRate;
        double heathDeduction = healthExpeditures * 0.5;

        return Math.max(grossTax - heathDeduction, 0.0);
    }
}
