package brayan.streams.findingAndMatching.Exercice02.test;

import brayan.streams.findingAndMatching.Exercice02.domain.Request;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Request> requestList = List.of(
                new Request(1L, "PAGO", 150.00),
                new Request(2L, "PENDENTE", 450.00),
                new Request(3L, "CANCELADO", 200.00),
                new Request(4L, "PAGO", 1250.50),
                new Request(5L, "PENDENTE", 80.00),
                new Request(6L, "CANCELADO", 499.99)
        );

        // 1. Validamos que todos os pedidos de status "PAGO" tenham o valor maior que zero
        System.out.println(requestList.stream()
                .filter(request -> request.getStatus().equals("PAGO"))
                .allMatch(request -> request.getValorTotal() > 0));

        // 2. Garante que nenhum pedido seja CANCELADO E tenha valorTotal superior a R$ 500,00
        System.out.println(requestList.stream()
                .noneMatch(request -> request.getStatus().equals("CANCELADO") && request.getValorTotal() > 500));

        // 3. Recuperamos qualquer pedido que esteja atualmente com o status pendente
        // e retornamos o ID do pedido recuperado caso exista
        requestList.stream()
                .filter(request -> request.getStatus().equals("PENDENTE"))
                .findAny()
                .ifPresentOrElse(
                        request -> System.out.println(request.getId()),
                        () -> System.out.println("Nenhum pedido pendente.")
                );
    }
}
