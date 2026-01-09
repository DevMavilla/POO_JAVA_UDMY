package POO.Memory.CONSTRUTORESthisENCAPSULAMENTO.POOEX5;

import java.util.Locale;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        Student student1 = new Student();
        System.out.println("Digite o nome do aluno: ");
        student1.name = sc.nextLine();

        System.out.println("Digite a média do primeiro trimestre do aluno: ");
        student1.firtstri = sc.nextDouble();
        System.out.println("Digite a média do segundo trimestre do aluno: ");
        student1.secondtri = sc.nextDouble();
        System.out.println("Digite a média do terceiro trimestre do aluno: ");
        student1.thirdtri = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f%n", student1.calcMedia());

        if (student1.calcMedia() < 60.0){
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student1.missingNote());
        }
        else {
            System.out.println("PASS");
        }
        sc.close();
    }
}
