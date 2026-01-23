package Java.Composicao.entities;

import java.util.Date;

public class HourContract {
    private Date date;
    private Double ValuePerHour;
    private Integer hours;

    public HourContract() {
    }

    public HourContract(Date date, Double valuePerHour, Integer hours) {
        this.date = date;
        this.ValuePerHour = valuePerHour;
        this.hours = hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return ValuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        ValuePerHour = valuePerHour;
    }

    public Integer getHour() {
        return hours;
    }

    public void setHour(Integer hour) {
        this.hours = hour;
    }

    public Double totalValue() {
        return ValuePerHour * hours;
    }

}
