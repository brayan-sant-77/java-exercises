package brayan.optional.Exercice03.repository;

import brayan.optional.Exercice03.domain.Product;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class ProductRepository {
    private static List<Product> productList = List.of(
            new Product("Milk", 2.0, 20),
            new Product("Apple", 1.0, 50),
            new Product("Bread", 0.50, 40),
            new Product("Juice", 1.50, 30),
            new Product("Lemon", 1.50, 35)
    );

    public static Optional<Product> findByName (String productName) {
        return findBy(product -> product.getName().equals(productName));
    }

    private static Optional<Product> findBy (Predicate<Product> predicate) {
        for (Product product : productList) {
            if (predicate.test(product)) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }
}
