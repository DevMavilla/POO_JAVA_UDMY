package Memory.EX9;

import java.util.Locale;
import java.util.Scanner;

public class Program9 {
    public static void main ( String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite um número");
            vect[i] = sc.nextDouble();
        }

        double soma = 0;

        for (int i = 0; i < vect.length; i++) {
            soma += vect[i];
        }

        double avg = soma / n;

        System.out.printf("Media do Vetor: %.3f\n", avg);
        System.out.println("Elementos abaixo da média: ");

        for (int i = 0; i < vect.length; i++) {
            if(vect[i] < avg){
                System.out.printf("%.1f\n", vect[i]);
            }
        }

        sc.close();

    }
}
