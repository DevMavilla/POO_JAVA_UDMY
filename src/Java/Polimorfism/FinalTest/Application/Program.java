package Java.Polimorfism.FinalTest.Application;

import Java.Polimorfism.FinalTest.entities.ImportedProduct;
import Java.Polimorfism.FinalTest.entities.Product;
import Java.Polimorfism.FinalTest.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.println("Enter the number of products:");
        int n = sc.nextInt();

        char ch = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i + 1) + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            ch = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            if ((ch == 'i') || (ch == 'I')) {
                System.out.print("Customs fee:");
                double customFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customFee));
            } else if (ch == 'u' || ch == 'U') {
                System.out.println("Date of manufacturate (DD/MM/YYYY): ");
                LocalDate manufacturedDate = LocalDate.parse(sc.next(),DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name, price, manufacturedDate));
            } else {
                list.add(new Product());
            }
        }

        System.out.println();
        System.out.println("Price TAGS:");
        for (Product p : list) {
            System.out.println(p.priceTag());
        }

        sc.close();

    }


}
