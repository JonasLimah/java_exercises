package section_8.OOP.java.entity;

public class Triangle {
    private double
            a,
            b,
            c;

    public Triangle(double i, double i1, double i2) {
        this.a = i;
        this.b = i1;
        this.c = i2;
    }

    public double area(){
        double p = (a + b + c)/2;
        return  Math.sqrt(p * (p - a) * (p - b)*(p - c));
    }

}
