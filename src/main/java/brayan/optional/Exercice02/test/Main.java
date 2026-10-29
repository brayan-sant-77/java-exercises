package brayan.optional.Exercice02.test;

import brayan.optional.Exercice01.domain.User;
import brayan.optional.Exercice01.repository.UserRepository;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<User> user = UserRepository.findByUserName("Brayan");
        Optional<String> optName = user.map(User::getEmail);
        optName.ifPresentOrElse(
                s -> System.out.println("Email do usuário: " + s),
                () -> System.out.println("Nenhum resultado encontrado")
                );
    }
}
