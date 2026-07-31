package brayan.collections.list.conversion;

import java.util.Arrays;
import java.util.List;

public class ClassicErro {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,20,30,40);

        // executando esse código vamos receber um UnsupportedOperationException
        // isso acontece porque quando uma lista é convertida para um array, pois o asList() retorna uma lista de tamanho fixo
        // e não uma implementação completa e redimensionável como a ArrayList
        numbers.add(50);
    }
}
