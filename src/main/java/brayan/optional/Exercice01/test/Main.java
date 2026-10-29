package brayan.optional.Exercice01.test;
/*Crie uma classe ‘User’ com os atributos name e endereço eletrónico. Depois, crie uma lista com pelo menos cinco usuários e implemente uma funcionalidade para procurar um usuário pelo nome.

O método de busca deve retornar um Optional<User>.

Requisitos:
- Se encontrar o usuário, retorne-o.
- Se não encontrar, retorne um Optional vazio.
- Na classe principal, exiba o nome e o e-mail quando o usuário existir.
- Caso contrário, exiba uma mensagem informando que ele não foi encontrado.
*/

import brayan.optional.Exercice01.domain.User;
import brayan.optional.Exercice01.repository.UserRepository;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<User> searchName = UserRepository.findByUserName("Otto");
        searchName.ifPresentOrElse(
                user -> System.out.println("Usuário encontrado: " + user),
                () -> System.out.println("Usuário não encontrado")
        );
    }
}
