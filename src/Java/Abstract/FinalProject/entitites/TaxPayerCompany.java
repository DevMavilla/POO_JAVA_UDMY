package Java.Abstract.FinalProject.entitites;

public class TaxPayerCompany extends TaxPayers{
    private Integer employees;


    public TaxPayerCompany( String name,Double anualIncome, Integer employees) {
        super(name, anualIncome);
        this.employees = employees;
    }

    public Integer getEmployees() {
        return employees;
    }

    public void setEmployees(Integer employees) {
        this.employees = employees;
    }

    @Override
    public final Double taxPayment() {

        double taxRate = (employees < 10) ? 0.16 : 0.14;
        double grossTax = getAnualIncome() * taxRate;

        return Math.max(grossTax, 0.0);
    }
}
