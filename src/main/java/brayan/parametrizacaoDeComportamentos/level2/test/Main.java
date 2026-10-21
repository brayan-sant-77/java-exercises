package brayan.parametrizacaoDeComportamentos.level2.test;

import brayan.parametrizacaoDeComportamentos.level2.domain.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>(List.of(
                new Product("Samsung", 1500, "smartphones"),
                new Product("Iphone 15", 3500, "smartphones"),
                new Product("The Prince", 40, "books"),
                new Product("Art of War", 50, "books"),
                new Product("Playstation 5", 3000, "consoles"),
                new Product("Playstation 4", 1200, "consoles")));

        System.out.println(filters(productList, product -> product.getName().equals("Art of War")));
        System.out.println(filters(productList, product -> product.getName().equals("Samsung")));
        System.out.println("----");
        System.out.println(filters(productList, product -> product.getPrice() < 100));
        System.out.println("----");
        System.out.println(filters(productList, product -> product.getCategory().equals("consoles")));

    }


    private static List<Product> filters(List<Product> list, Predicate<Product> filter) {
        List<Product> products = new ArrayList<>();
        for (Product product : list) {
            if (filter.test(product)) {
                products.add(product);
            }
        }
        return products;
    }
}
