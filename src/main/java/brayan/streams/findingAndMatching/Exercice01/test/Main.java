package brayan.streams.findingAndMatching.Exercice01.test;

import brayan.streams.findingAndMatching.Exercice01.domain.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = List.of(
                new Product("Mouse Gamer", 150.00, "Acessórios"),
                new Product("Cadeira Ergonômica", 1200.00, "Móveis"),
                new Product("Smartphone X", 2800.00, "Eletrônicos"),
                new Product("Monitor UltraWide", 1450.00, "Eletrônicos"),
                new Product("Cafeteira Elétrica", 250.00, "Eletrodomésticos"),
                new Product("Notebook Pro", 5500.00, "Eletrônicos")
        );

        System.out.println(productList.stream()
                .anyMatch(product -> product.getPrice() > 1500));

        productList.stream()
                .filter(product ->  product.getCategory().equals("Eletrônicos"))
                .findFirst()
                .ifPresentOrElse(
                        product -> System.out.println(product.getName()),
                        () -> System.out.println("Nenhum eletrônico encontrado!")
                );
    }
}
