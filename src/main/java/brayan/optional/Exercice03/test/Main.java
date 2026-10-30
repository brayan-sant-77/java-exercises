package brayan.optional.Exercice03.test;

import brayan.optional.Exercice03.domain.Product;
import brayan.optional.Exercice03.repository.ProductRepository;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<Product> productByName = ProductRepository.findByName("Pizza");
        productByName.ifPresentOrElse(
                product -> System.out.println("Produto Encontrado: " + product),
                () -> System.out.println("Produto não cadastrado no estoque"));
    }
}
