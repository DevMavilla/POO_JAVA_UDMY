package EMEX2;
import EMEX2.util2.CurrencyConverter;
import java.util.Locale;
import java.util.Scanner;

public class EXME2 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        CurrencyConverter currencyConverter = new CurrencyConverter();

        System.out.print("What is the dollar price? ");
        currencyConverter.dollarPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        currencyConverter.quantityDollarBuy = sc.nextDouble();

        System.out.printf("Amount to be paid in trais %.2f%n",  currencyConverter.Converter());

        sc.close();
    }
}
