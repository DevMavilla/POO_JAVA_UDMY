package Java.AbstractMethods.application;

import Java.AbstractMethods.entities.Circle;
import Java.AbstractMethods.entities.Rectangle;
import Java.AbstractMethods.entities.Shape;
import Java.AbstractMethods.entities.enums.Color;
import Java.Polimorfism.FinalTest.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Shape>list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();
        sc.nextLine();

        char ch = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Shape #" + (i + 1) + " data: ");
            System.out.print("Rectangle or Circle? (r/c)");
            ch = sc.next().charAt(0);
            System.out.print("Color: (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if ((ch == 'r') || (ch == 'R')) {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                list.add(new Rectangle(color, width, height));
            } else if (ch == 'c' || ch == 'C') {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color, radius));
            }

        }

        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for (Shape sh: list){
            System.out.printf("%.2f%n", sh.area());
        }
     sc.close();
    }
}
