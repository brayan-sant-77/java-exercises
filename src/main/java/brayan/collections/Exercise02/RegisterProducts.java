package brayan.collections.Exercise02;

import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;
    private int quantity;



    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public Product(String name, double price, int quantity) {
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

    public int getQuantity() {
        return quantity;
    }
}

public class RegisterProducts {
    public static void main(String[] args) {
         List<Product> products = new ArrayList<>();

        Product notebook = new Product("Notebook", 2500D, 5);
        Product mouse = new Product("Mouse", 150.50, 10);
        Product teclado = new Product("Teclado", 200D, 7);
        Product monitor = new Product("Monitor", 500, 9);
        Product headset = new Product("Headset", 600, 15);

        products.add(notebook);
        products.add(mouse);
        products.add(teclado);
        products.add(monitor);
        products.add(headset);

        for (Product product : products) {
            System.out.println(product);
        }

    }
}
