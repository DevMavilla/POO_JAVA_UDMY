package Java.Abstract.FinalProject.Application;

import Java.Abstract.AbstractMethods.entities.Circle;
import Java.Abstract.FinalProject.entitites.TaxPayerCompany;
import Java.Abstract.FinalProject.entitites.TaxPayerIndividual;
import Java.Abstract.FinalProject.entitites.TaxPayers;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPayers> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        sc.nextLine();

        char ch = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Tax payer #" + (i + 1) + " data: ");
            System.out.print("Individual or Company? (i/c)");
            ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual Income: ");
            double anualIncome = sc.nextDouble();

            if ((ch == 'i') || (ch == 'I')) {
                System.out.print("Health expeditures: ");
                double healthExpeditures = sc.nextDouble();
                list.add(new TaxPayerIndividual(name, anualIncome, healthExpeditures));
            } else if (ch == 'c' || ch == 'C') {
                System.out.print("Number of employees: ");
                int employees = sc.nextInt();
                list.add(new TaxPayerCompany(name, anualIncome, employees));
            }

        }

        double sum = 0;

        System.out.println();
        System.out.println("TAXES PAIDS: ");
        for (TaxPayers tp: list){
            sum += tp.taxPayment();
            System.out.printf(tp.getName() + ": $" + String.format("%.2f%n", tp.taxPayment()));
        }
        System.out.printf("TOTAL TAKES: $ %.2f", sum);
        sc.close();
    }
}
