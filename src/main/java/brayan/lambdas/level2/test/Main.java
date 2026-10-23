package brayan.lambdas.level2.test;

import brayan.lambdas.level2.domain.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Product> listProducts = new ArrayList<>(List.of(
                new Product("Mouse", 80),
                new Product("Smartwatch x50", 50),
                new Product("PS4", 1500),
                new Product("Iphone 15", 4000)
        ));

        List<Product> filteredList = filter(listProducts, product -> product.getPrice() < 100);
        System.out.println(map(filteredList, product -> product.getName() + " - " + "R$ " + product.getPrice()));

    }

    private static List<Product> filter(List<Product> list, Predicate<Product> predicate) {
        List<Product> productList = new ArrayList<>();
        for (Product product : list) {
            if (predicate.test(product)) {
                productList.add(product);
            }
        }
        return productList;
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }
}
