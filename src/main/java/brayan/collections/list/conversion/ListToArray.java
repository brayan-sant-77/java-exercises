package brayan.collections.list.conversion;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C#");
        languages.add("Go");
        languages.add("Rust");

        String[] arrayLanguages = languages.toArray(new String[0]);

        int pos = 0;
        for (int i = 0; i < arrayLanguages.length; i++) {
            System.out.println("Position " + i + ": " + arrayLanguages[i]);

        }
    }
}
