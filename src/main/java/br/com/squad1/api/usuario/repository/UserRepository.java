package br.com.squad1.api.usuario.repository;

import br.com.squad1.api.usuario.model.User;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User, Long> {
    User save(User user);

    //@Query(value = "select id, name, email, created_at from users where id = :userId", nativeQuery = true)
    Optional<User> findById(@Param("userId") Long userId);

    //@Query(value = "select id, name, email, created_at from users", nativeQuery = true)
    Iterable<User> findAll();

    //@Query(value = "select id, name, email, created_at from users where email = :email", nativeQuery = true)
    Optional<User> findByEmail(@Param("email") String email);
}
