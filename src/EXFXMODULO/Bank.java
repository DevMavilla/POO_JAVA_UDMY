package EXFXMODULO;

import EXFXMODULO.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account = new Account();

        System.out.println("Enter account number: ");
        int NumberAccount = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter account holder: ");
        String holder = sc.nextLine();

        System.out.println("IS there na initial deposit (Y/N)? ");
        char affirmative = sc.next().charAt(0);

        if (affirmative == 'y' || affirmative == 'Y'){
            System.out.println("Enter initial deposit value: ");
            double initalDeposit = sc.nextDouble();
            account = new Account(NumberAccount, holder, initalDeposit);
        }
        else {
            account = new Account(NumberAccount, holder);
        }

        System.out.println("\nAccount data: ");
        System.out.println(account);

        System.out.print("\nEnter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account value: \n" + account);

        System.out.print("\nEnter Withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated account value: \n" + account);

        sc.close();
    }
}
