package Memory.EX7;

import java.util.Locale;
import java.util.Scanner;

public class Program7 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*Faça um programa que leia N números reais e armazene-os em um vetor.
         Em seguida, mostrar na tela o maior número do vetor (supor não haver empates).
         Mostrar também a posição do maior elemento, considerando a primeira posição como 0 (zero).*/

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double vect[] = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        int poshigher = 0;
        double higher = vect[0];


        for (int i = 0; i < vect.length; i++) {
          if (vect[i] > higher){
              higher = vect[i];
              poshigher = i;
          }
        }

        System.out.printf("MAIOR VALOR = %.1f\n", higher);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", poshigher);

        sc.close();
    }
}