package Memory.EX5;

import java.util.Locale;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números vcê vai digitar? ");
        int n = sc.nextInt();
        double soma, media;

        double vect[] = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        soma =0;
        for (int i = 0; i < n; i++) {
            soma  += vect[i];
        }

        media = soma / n;

        System.out.print("valores = ");

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%.1f " , vect[i]);
        }

        System.out.printf("\nSoma = %.2f%n" , soma);
        System.out.printf("Média = %.2f%n" ,media);

        sc.close();
    }
}