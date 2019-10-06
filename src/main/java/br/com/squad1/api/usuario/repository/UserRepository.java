package br.com.squad1.api.usuario.repository;

import br.com.squad1.api.usuario.model.User;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User save(User user);
    Optional<User> findById(Long userId);
    Iterable<User> findAll();
    Optional<User> findByEmail(String email);
}
