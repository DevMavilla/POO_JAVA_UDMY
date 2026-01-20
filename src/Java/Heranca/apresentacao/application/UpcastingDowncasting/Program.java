package Java.Heranca.apresentacao.application.UpcastingDowncasting;

import Java.Heranca.apresentacao.entities.Account;
import Java.Heranca.apresentacao.entities.BusinessAccount;
import Java.Heranca.apresentacao.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {


        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "ALeex", 500.00, 0.01));
        list.add(new BusinessAccount(1002, "Maria", 1000.00, 400.00));
        list.add(new SavingsAccount(1004, "Bob", 300.00, 0.01));
        list.add(new BusinessAccount(1005, "aNNA", 500.00, 500.00));

        Double sum = 0.0;

        for (Account acc: list){
            sum += acc.getBalance();
        }

        for(Account acc: list){
            acc.deposit(10.0);
        }

        for (Account acc: list){
            System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }
        System.out.printf("Total balance: %.2f%n", sum);















































        /*
        Account acc = new Account(1002, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1001, "Maria", 1000.0, 500.0);

        //UPCASTING

        Account acc1 = bacc;
        Account acc2 = new Account(1003, "Bob", 1000.0);
        Account acc3 = new SavingsAccount(1004, "Ana", 1000.0, 0.01);

        //Downcasting

       // BusinessAccount acc4 =  (BusinessAccount) acc2;
        //  acc4.loan(100.0);

       // BusinessAccount acc5 = (BusinessAccount) acc3;
        /* if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.00);
            System.out.println("Loan!");
        }

        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }


        acc2.withdraw(200.00);
        System.out.println(acc2.getBalance());

        acc3.withdraw(200.00);
        System.out.println(acc3.getBalance());

        bacc.withdraw(200.00);
        System.out.println(bacc.getBalance());


*/

    }
}
