package brayan.collections.BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindingTheInsertIndex {
    public static void main(String[] args) {
        final List<Integer> list = new ArrayList<>();

        list.add(20);
        list.add(10);
        list.add(50);
        list.add(30);
        list.add(40);

        System.out.println("=== LIST ===");

        // ordenamos a lista por ordem crescente (padrão)
        Collections.sort(list);

        // impressão dos números da lisa definida
        for (Integer i : list) {
            System.out.println(i);
        }

        int result = Collections.binarySearch(list, 35);
        int insertionPoint = insertPoint(result);


        System.out.println();
        System.out.println("Binary Search Result: " + result);
        System.out.println("Insertion Point: " + insertionPoint);
    }

    public static int insertPoint(int result) {
        return -(result + 1);
        //  -(ponto de inserção) - 1
    }
}
