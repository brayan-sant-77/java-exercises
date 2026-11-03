package brayan.streams.introduction.Exercice01;

/*Enunciado:

Crie uma lista de números inteiros:

10, 15, 20, 25, 30, 35, 40, 45, 50

Utilize Streams para:
1. Exibir somente os números maiores que 25.
2. Exibir somente os números pares.
3. Exibir os números menores que 30.*/


import java.util.List;

public class FilterNumber {

    public static void main(String[] args) {
        List<Integer> listNumbers = List.of(10, 15, 20, 25, 30, 35, 40, 45, 50);

        // stream de números maiores que 25
        listNumbers.stream()
                .filter(n -> n > 25)
                .forEach(System.out::println);

        System.out.println("-------");

        // streams de números pares
        listNumbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        System.out.println("-------");

        // streams de números maiores que 30
        listNumbers.stream()
                .filter(n -> n > 30)
                .forEach(System.out::println);
    }
}
