package Java.Heranca.apresentacao.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TesteAntigravity {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Account> list = new ArrayList<>();

        System.out.print("Digite a qunatidade de contas que serão digitalizadas: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter account number: ");
            int number = sc.nextInt();
            System.out.print("Enter account holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Enter account balance: ");
            double balance = sc.nextDouble();

            list.add(new Account(number, holder, balance));
            System.out.println(list.get(i).getBalance());

            sc.close();
        }
    }
}
