package brayan.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Comparing {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>(); // no HashSet não existe uma organização, os dados são postos de forma aleatória
        System.out.println("=== HASHSET ===");
        hashSet.add("Aizen");
        hashSet.add("Broly");
        hashSet.add("Chrollo");
        hashSet.add("Deku");
        hashSet.add("Edward Elric");

        for (String s : hashSet) {
            System.out.println(s);
        }

        Set<String> linked = new LinkedHashSet<>(); // aqui notamos que o LinkedHashSet organiza os itens
        System.out.println("=== LINKED HASHSET ===");
        linked.add("Aizen");
        linked.add("Broly");
        linked.add("Chrollo");
        linked.add("Deku");
        linked.add("Edward Elric");

        for (String s : linked) {
            System.out.println(s);
        }

    }
}
