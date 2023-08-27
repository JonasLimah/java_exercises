package util;

public class CurrencyConverter {
    public static int IOF  = 6;
    public static double converter(double dollar,double dollarAmount){
        dollar = dollar * dollarAmount;
        return dollar+(dollar*IOF/100);
    }

}
