package section_8.OOP.java.entity;

//classe produto ler os dados do produto e mostar controle de saida e entradada de dados
public class Product {
    private String name = "Product";
    private double price = 0.00;
    private int quantity = 0;

    public Product(String name, double price, int quantity) {
        if((name == null && name == "") || price < 0.0 || quantity < 0 ) return;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity * price;
    }

    public int totalValueInStock() {
        return this.quantity;
    }

    public int addProducts(int quantity) {
        this.quantity = this.quantity + quantity;
        System.out.printf("It has been added %d in stock%nthe actualy stock is %d%n",quantity,this.quantity);
        return this.quantity;
    }
    public int removeProducts(int quantity) {
        this.quantity = this.quantity - quantity;
        System.out.printf("It has been removed %d in stock%nthe actualy stock is %d %n",quantity,this.quantity);
        return this.quantity;
    }
    public String toString(){
        return "product data: "+
                getName() +
                ",$ " +
                String.format("%.2f",getPrice()) +
                "stock " +
                getQuantity() +
                ",Total stock value: "+
                String.format("%.2f",getQuantity());
    }
}
