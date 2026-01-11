package Listas.Formulas.ExLists.EX1.entities;

import java.util.Locale;
import java.util.Scanner;

public class Employee {
    private Integer id;
    private String name;
    private Double salary;



    public Employee(String name, Integer id, Double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void increaseSalary(double percentage) {
        salary += salary * percentage / 100.0;
    }


    @Override
    public String toString() {
        return  id + ", "+ name + ", " + salary + '}';
    }


}








