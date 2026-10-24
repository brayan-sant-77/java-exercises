package brayan.methodReference.level2.exercice2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class OrderCreator {
    public static void main(String[] args) {
        List<String> customers = List.of("Ana", "Bruno", "Carlos");
        List<Double> prices = List.of(150.0, 300.0, 450.0);

        BiFunction<String, Double, Order> biFunction = Order::new;

        List<Order> orders = new ArrayList<>();
        for (int i = 0; i < customers.size(); i++) {
            // percorremos as listas e pegamos os valores dos índices e associamos eles
            String s = customers.get(i);
            Double v = prices.get(i);

            orders.add(biFunction.apply(s, v)); // passamos os valores pedidos no BiFunction e adicionamos na lista orders
        }

        for (Order order : orders) {
            System.out.println("Cliente: " + order.getCustomerName() + " | Total: R$" + order.getTotalPrice());
        }

    }
}
