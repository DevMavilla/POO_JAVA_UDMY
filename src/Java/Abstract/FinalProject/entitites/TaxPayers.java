package Java.Abstract.FinalProject.entitites;

public abstract class TaxPayers {
    private String name;
    private Double anualIncome;

    public TaxPayers(String name, double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }

    public abstract Double taxPayment();



}
