package brayan.streams.flatmaps.Exercice01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Requisitos:

Transforme todas as listas internas em um único Stream. (X)
Obtenha uma lista contendo todos os números. (X)
Exiba somente os números pares. (X)
Calcule a soma dos números ímpares.
*/

public class UnifyingLists {
    public static void main(String[] args) {
        List<List<Integer>> numbers = List.of(
                List.of(1, 2, 3, 4, 5),
                List.of(6, 7, 8, 9, 10),
                List.of(11, 12, 13, 14, 15)
        );

        // Realizando o achatamento. Facilitando o uso posterior e evitando repetições
        List<Integer> allNumbers = numbers.stream()
                .flatMap(List::stream)
                .toList();

        System.out.println("--- LISTA COM TODOS OS NÚMEROS ---");
        // obtemos a lista com todos os números
        allNumbers.forEach(System.out::println);

        System.out.println("--- APENAS OS VALORES PARES ---");
        // filtrando apenas os valores pares
        allNumbers.stream()
                .filter(n -> n % 2 == 0) // filtra os números pares
                .forEach(System.out::println); // percorre a stream e exibe os valores


        System.out.println("--- SOMA DOS VALORES ÍMPARES ---");
        // soma dos valores ímpares
        List<Integer> oddResult = Collections.singletonList(allNumbers.stream()
                .filter(n -> n % 2 != 0) // filtra apenas os números ímpares
                .mapToInt(Integer::intValue) // Transforma o Stream<Integer> em um IntStream. O IntStream possui operações específicas para números primitivos
                .sum()); // vai calcular a soma dos valores

        System.out.println(oddResult);
    }
}
