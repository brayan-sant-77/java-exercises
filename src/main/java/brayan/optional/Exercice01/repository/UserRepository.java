package brayan.optional.Exercice01.repository;

import brayan.optional.Exercice01.domain.User;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class UserRepository {
    private static List<User> users = List.of(
            new User("Brayan", "brayanxxxx@gmail.com"),
            new User("Test", "test55@gmail.com"),
            new User("Otto", "otto99@gmail.com")
    );

    public static Optional<User> findByUserName(String userName) {
        return findBy(name -> name.getName().equals(userName));
    }

    private static Optional<User> findBy(Predicate<User> predicate) {
        for (User user : users) {
            if (predicate.test(user)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }

}
