package Memory.EX11;

import Memory.EX11.entities.People;

import java.util.Locale;
import java.util.Scanner;

public class Program11 {
    public static void main ( String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, moreOlderAge = 0;
        String moreOlderName = "";

        System.out.print("Quantas pessoas você vai digitar? ");
        n = sc.nextInt();
        People[] people = new People[n];

        for (int i = 0; i < people.length; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            people[i] = new People(name, age);
        }

        for (int i = 0; i < people.length; i++) {
            if(people[i].getAge() > moreOlderAge){
                moreOlderAge =  people[i].getAge();
                moreOlderName =  people[i].getName();
            }
        }
        System.out.println("Pessoa mais velha: " + moreOlderName);
        sc.close();
        }
    }