package br.com.squad1.api.usuario.service;

import br.com.squad1.api.usuario.model.User;
import java.util.Optional;

public interface UserServiceInterface {
    Optional<User> findById(Long userId);
    Iterable<User> findAll();
    Optional<User> findByEmail(String email);
}
