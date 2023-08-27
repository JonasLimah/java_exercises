package section_4.exercise.java;

import java.util.Locale;

public class Exercise_1 {
   private String product1 = "computer";
    private String product2 = "Office desk";
    private int age = 30;
    private int code = 5290;
    private char gender = 'F';
    private double price1 = 2100.0;
    private double price2 = 650.50;
    private double meassure = 52.234567;
    public void run(){
        System.out.println("Products:");
        System.out.format("%s, wich price is $ %.2f%n%s,wich is $ %.2f",this.product1,this.price1,this.product2,this.price2);
        System.out.format("Record : %d years old, code %d and gender: %s%n",this.age,this.code,this.gender);
        Locale.setDefault(Locale.US);
        System.out.printf("Meassure with wight decimal places: %.8f%nRounded (three places): %.3f%nUS decimal point: %.3f",this.meassure,this.meassure,this.meassure);
    }
}
