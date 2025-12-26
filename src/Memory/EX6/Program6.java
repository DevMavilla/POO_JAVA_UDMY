package Memory.EX6;

import java.util.Locale;
import java.util.Scanner;

public class Program6 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*Faça um programa que leia N números inteiros e armazene-os em um vetor.
         Em seguida, mostre na tela todos os números pares, e também a quantidade de números pares.*/

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        int pares = 0;

        int vect[] = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("NÚMEROS PARES: ");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i]  %2 == 0) {
                System.out.print(vect[i] + " ");
                pares += 1;
            }
        }

        System.out.print("\nQUANTIDADE DE  PARES: " + pares);

        sc.close();
    }
}