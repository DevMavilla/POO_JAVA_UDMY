package POOEX4;
import java.util.Locale;
import java.util.Scanner;

public class Programa4 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Digite o nome do funcionário: ");
        employee.name = sc.nextLine();

        System.out.print("Digite o salário bruto do funcionário: ");
        employee.grossSalary = sc.nextDouble();

        System.out.print("Digite a taxa do funcionário: ");
        employee.tax = sc.nextDouble();

        System.out.println("employee: " + employee.name + ", $ " + employee.netSalary());

        System.out.print("Digite um valor de aumento do salário do funcionário: ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println("Upsated data: " + employee);

        sc.close();
    }
}
