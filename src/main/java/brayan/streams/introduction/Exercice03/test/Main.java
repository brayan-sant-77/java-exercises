package brayan.streams.introduction.Exercice03.test;

import brayan.streams.introduction.Exercice03.domain.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = List.of(
                new Product("Notebook", 2500),
                new Product("Mouse", 45),
                new Product("Teclado", 120),
                new Product("Monitor", 850),
                new Product("Headset", 180),
                new Product("Pen Drive", 25),
                new Product("Cabo USB", 15),
                new Product("Webcam", 95),
                new Product("Mousepad", 35),
                new Product("Caixa de Som", 65)
        );

        System.out.println("--- PRODUTOS ACIMA DE R$50 ---");
        // Filtrando produtos acima de R$50
        productList.stream()
                .filter(price -> price.getPrice() > 50)
                .forEach(System.out::println);

        System.out.println();
        // Filtrando produtos abaixo de R$30
        System.out.println("--- PRODUTOS ABAIXO DE R$30 ---");
        productList.stream()
                .filter(price -> price.getPrice() < 30)
                .forEach(System.out::println);

        System.out.println();
        // Exibindo o nome dos produtos cadastrados
        System.out.println("--- PRODUTOS CADASTRADOS ");
        productList.stream()
                .map(Product::getName)
                .forEach(System.out::println);

        System.out.println();
        // Exibindo produtos entre R$30 e R$100
        System.out.println("--- PRODUTOS ENTRE R$30 E R$100 ---");
        productList.stream()
                .filter(price -> price.getPrice() > 30 && price.getPrice() < 100)
                .forEach(System.out::println);
    }
}
