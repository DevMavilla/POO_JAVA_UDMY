package POO.Memory.CONSTRUTORESthisENCAPSULAMENTO.POOEX3;
import java.util.Locale;
import java.util.Scanner;

public class Programa3 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle width:");
        rectangle.width = sc.nextDouble();

        System.out.println("Enter rectangle width:");
        rectangle.height = sc.nextDouble();

        rectangle.calcArea();
        rectangle.calcPerimeter();
        rectangle.calcDiagonal();

        System.out.println(rectangle);

    sc.close();
    }
}
