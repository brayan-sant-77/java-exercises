package brayan.methodReference.level1.exercice2;

import java.util.List;
import java.util.function.Consumer;

//Enunciado
//Você deverá criar um programa que processe uma lista de mensagens e
//as imprima utilizando um objeto responsável por essa tarefa.

public class MessageProcessor {
    public static void main(String[] args) {
        List<String> messages = List.of(
                "Estudando Java",
                "Aprendendo lambdas",
                "Praticando method reference"
        );

        MessagePrinter messagePrinter = new MessagePrinter();

        Consumer<String> consumer = messagePrinter::printMessage;

        for (String m : messages) {
            consumer.accept(m);
        }

    }
}
