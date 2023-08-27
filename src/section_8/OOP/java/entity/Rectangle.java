package section_8.OOP.java.entity;

//ler valores de um retangulo e mostrar area,lad diagonal e perimetro.
public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimetre() {
        return 2 * (width + height);
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

    public String toString() {
        return "AREA = " + String.format("%.2f", area()) +
                "\nPERIMETRE = " + String.format("%.2f", perimetre()) +
                "\nDIAGONAL = " + String.format("%.2f", diagonal());
    }
}
