package brayan.methodReference.level2.exercice1;

//Você vai criar um pequeno programa que transforma
//uma lista de nomes em uma lista de objetos Product

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ProductCreator {
    public static void main(String[] args) {
        List<String> productNames = List.of(
                "Mouse",
                "Teclado",
                "Monitor",
                "Headset"
        );

        Function<String, Product> creator = Product::new; // recebemos o nome de um produto e retornamos um objeto do tipo Product

        List<Product> productList = new ArrayList<>();
        for (String s : productNames) {
            Product applied = creator.apply(s);
            productList.add(applied);
            // nesse for nós criamos os produtos e adicionamos eles na lista productList
        }

        for (Product product : productList) {
            System.out.println(product.getName());
            // usamos esse for para percorrer o productList e imprimir os nomes
        }
    }
}
