package Listas.Formulas.ExLists.EX1;

import Listas.Formulas.ExLists.EX1.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Employee #" + (i + 1) + ":");

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Id: ");
            Integer id = sc.nextInt();

            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            //tipo
            Employee emp = new Employee(name, id, salary);
            employees.add(emp);
        }

        System.out.print("Enter the empoloyee id that will hae salary increase: ");
        Integer increaseSalaryId = sc.nextInt();

        Employee emp = employees.stream().filter(e -> e.getId().equals(increaseSalaryId)).findFirst().orElse(null);

        if (emp == null){
            System.out.println("This id does not exist!");
        }else {
            System.out.println("Enter the percentage");
            Double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees:");

        for (Employee e : employees) {
            System.out.printf("%d, %s, %.2f%n", e.getId(), e.getName(), e.getSalary());
        }

        sc.close();
    }
}
