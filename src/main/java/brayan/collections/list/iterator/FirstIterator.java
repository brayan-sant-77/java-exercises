package brayan.collections.list.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* Crie uma lista com cinco nomes
 Percorra utilizando apenas Iterator
 Imprima todos os nomes
* */

public class FirstIterator {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Júlia");
        names.add("Catarina");
        names.add("Brayan");
        names.add("Luna");
        names.add("Mariáh");

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String nextName = iterator.next();
            System.out.println(nextName);
        }
    }
}
