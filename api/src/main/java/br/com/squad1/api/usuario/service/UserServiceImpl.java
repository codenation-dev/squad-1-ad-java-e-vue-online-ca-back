package br.com.squad1.api.usuario.service;

import br.com.squad1.api.usuario.model.User;
import br.com.squad1.api.usuario.repository.UserRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserServiceInterface {

    @Autowired
    UserRepository userRepository;
    
    public User save(User user) {
        return this.userRepository.save(user);
    }
    
    @Override
    public Optional<User> findById(Long userId) {
        throw new UnsupportedOperationException("Falta implementar."); 
    }

    @Override
    public Iterable<User> findAll() {
        return this.userRepository.findAll();
    }
  
}
