package brayan.lambdas.level1;

import java.util.List;
import java.util.function.Consumer;

public class MessageProcessor {
    public static void main(String[] args) {
        List<String> strings = List.of("java", "spring", "backend");
        processMessages(strings, s -> System.out.println("Palavra: " + s.toUpperCase()));
    }

    private static void processMessages(List<String> list, Consumer<String> consumer) {
        for (String s : list) {
            consumer.accept(s);
        }
    }
}
