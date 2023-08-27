package section_8.OOP.java.entity;

public class Employers {
    private String name;
    private double grossSaalary;
    private double tax;
    public Employers(String name, double grossSaalary, double tax){
        this.name = name;
        this.grossSaalary = grossSaalary;
        this.tax = tax;
    }
    public double getSalary(){
        return grossSaalary - tax;
    }
    public double increaseSalary(double tax){
        grossSaalary = grossSaalary + (grossSaalary*tax/100);
        return  grossSaalary;
    }
    public  String toString(){
        return "Employer: " + this.name + ", $ "+
                String.format("%.2f", getSalary());
    }
}
