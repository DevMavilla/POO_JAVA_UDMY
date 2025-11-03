package POOEX1;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle(); //instâncias
        y = new Triangle(); //instâncias

        System.out.println("Enter the measure of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measure of triangle X: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

       double areaX = x.area();
       double areay = y.area();

        System.out.printf("Triangle X area %.4f%n\n", areaX);
        System.out.printf("Triangle y area %.4f%n\n", areay);

        if(areaX > areay){
            System.out.println("Large area: X\n" + areaX);
        }
        else{
            System.out.println("Large area: y " + areay);
        }
        sc.close();
    }
}
