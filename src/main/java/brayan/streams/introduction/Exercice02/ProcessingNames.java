package brayan.streams.introduction.Exercice02;
/*
* Utilize Streams para realizar as seguintes operações:
1. Exibir todos os nomes da lista. (X)
2. Exibir somente os nomes que possuem mais de cinco caracteres. (X)
3. Exibir somente os nomes que começam com a letra B. (X)
4. Exibir todos os nomes em letras maiúsculas.

Regras
- Utilize Streams em todas as operações.
- Cada operação deverá criar sua própria Stream.
- Não utilize laços for ou while.
- Não modifique a lista original.*/

import java.util.List;

public class ProcessingNames {
    private static List<String> namesList = List.of(
            "Brayan",
            "Ana",
            "Carlos",
            "Mariana",
            "Pedro",
            "Beatriz"
    );

    public static void main(String[] args) {
        // Exibindo nomes da lista
        namesList.stream()
                .forEach(System.out::println);

        System.out.println("-----");

        // Exibindo nomes que possuem mais de 5 caracteres
        namesList.stream()
                .filter(name -> name.length() > 5)
                .forEach(System.out::println);

        System.out.println("-----");
        // Exibindo nomes que começam com a letra B
        namesList.stream()
                .filter(name -> name.startsWith("B"))
                .forEach(System.out::println);

        System.out.println("-----");
        // Exibindo os nomes em letras maiúsculas
        namesList.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
