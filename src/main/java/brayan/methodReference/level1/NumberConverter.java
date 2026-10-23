package brayan.methodReference.level1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

//1. Converta as strings em números inteiros usando Function<String, Integer>.
//2. Primeiro, faça a conversão utilizando uma expressão lambda.
//3. Depois, substitua a lambda por uma referência a método estático.
//4. Imprima a lista resultante.
//Objetivo: entender quando uma lambda pode ser substituída por Classe::metodo.
public class NumberConverter {
    public static void main(String[] args) {
        List<String> numbers = List.of("10", "20", "30", "40");
        List<Integer> list = new ArrayList<>();
        // Function<String, Integer> convertStringToInteger = s -> Integer.parseInt(s;
        Function<String, Integer> convertStringToInteger = Integer::parseInt;
        for (String number : numbers) {
            Integer apply = convertStringToInteger.apply(number);
            list.add(apply);
        }
        System.out.println(list);

    }
}
