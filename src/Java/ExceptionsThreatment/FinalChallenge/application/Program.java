package Java.ExceptionsThreatment.FinalChallenge.application;
import Java.ExceptionsThreatment.FinalChallenge.model.entities.Account;
import java.util.Locale;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        while (true) {

            System.out.println("Enter acount data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account ac = new Account(number, holder, balance, withdrawLimit);
            System.out.println("Enter amount for withdraw: ");
            double amount = sc.nextDouble();
            System.out.println("New balance: " + ac.getBalance());
        }
    }
}