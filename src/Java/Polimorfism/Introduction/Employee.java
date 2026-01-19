package Java.Polimorfism;

public class Employee {
    private String name;
    private Integer hour;
    private Double valuePerHOur;



    public Employee() {
    }

    public Employee(String name, Integer hour, Double valuePerHOur) {
        super();
        this.name = name;
        this.hour = hour;
        this.valuePerHOur = valuePerHOur;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Double getValuePerHOur() {
        return valuePerHOur;
    }

    public void setValuePerHOur(Double valuePerHOur) {
        this.valuePerHOur = valuePerHOur;
    }

    public Double payment(){
        return hour * valuePerHOur;
    }
}