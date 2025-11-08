package CONSTRUTORESthisENCAPSULAMENTO;
import CONSTRUTORESthisENCAPSULAMENTO.entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class  Construtores {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("price: ");
        double price = sc.nextDouble();

        Product product = new Product(name, price);


        System.out.println();
        System.out.println("Poduct data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Poduct data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Poduct data: " + product);

        sc.close();
    }
}
