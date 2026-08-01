package brayan.collections.list.conversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ModifiableArrayList {
    public static void main(String[] args) {
        String[] citiesArray = {"São Paulo", "Rio", "Salvador"};

        List<String> citiesList = new ArrayList<>(Arrays.asList(citiesArray));

        citiesList.add("Minas Gerais");
        citiesList.add("Brasília");
        citiesList.remove("Rio");

        System.out.println(citiesList);
    }
}
