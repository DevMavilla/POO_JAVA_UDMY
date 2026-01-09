package POO.Memory.CONSTRUTORESthisENCAPSULAMENTO.EMEX1.EX2.util2;

public class CurrencyConverter {
    public double dollarPrice;
    public double quantityDollarBuy;
    public static final double IOF = 0.06;

    public double Converter(){
        return (quantityDollarBuy * dollarPrice * (1 + IOF));
    }
}
