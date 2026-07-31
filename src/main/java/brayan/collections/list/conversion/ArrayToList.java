package brayan.collections.list.conversion;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        String[] names = {
                "Brayan",
                "Carlos",
                "Lucas",
                "Pedro",
                "Ana"
        };

        List<String> namesList = Arrays.asList(names);
        System.out.println("All Elements: " + namesList);
        System.out.println("List Size: " + namesList.size());
        System.out.println("First Element: " + namesList.get(0));
        System.out.println("Last Element: " + namesList.get(4));
    }
}
