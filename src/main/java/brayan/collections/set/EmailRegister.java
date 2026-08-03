package brayan.collections.set;

import java.util.HashSet;
import java.util.Set;

public class EmailRegister {
    public static void main(String[] args) {
        Set<String> emails = new HashSet<>();

        String[] emailsToRegister = {
                "ana@gmail.com",
                "brayan@gmail.com",
                "carlos@gmail.com",
                "ana@gmail.com",
                "lucas@gmail.com",
                "brayan@gmail.com",
        };

        for (String email : emailsToRegister) {
            boolean add = emails.add(email);
            if (add) {
                System.out.println("---------------");
                System.out.println("Email cadastrado: " + email);
            } else {
                System.out.println("---------------");
                System.out.println("Email já cadastrado: " + email);
            }
        }

    }
}
