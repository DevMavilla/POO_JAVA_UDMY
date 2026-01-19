package Java.Polimorfism.Introduction;

public class OutSourcedEmployee extends OutSourcedEmployee.Employee {

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

    public static class Employee {
        private String name;
        private Integer hour;
        private Double valuePerHOur;

        public Employee() {
        }

        public Employee(String name, Integer hour, Double valuePerHOur) {
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
}
