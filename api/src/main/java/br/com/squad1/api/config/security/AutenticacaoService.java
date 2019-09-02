package br.com.squad1.api.config.security;

import br.com.squad1.api.usuario.model.User;
import br.com.squad1.api.usuario.repository.UserRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AutenticacaoService implements UserDetailsService{

    @Autowired
    private UserRepository userRepository;
    
    @Override
    public UserDetails loadUserByUsername(String string) throws UsernameNotFoundException {
        Optional<User> usuario = this.userRepository.findByEmail(string);
        
        if (usuario.isPresent()) {
            return usuario.get();
        }
        
        throw new UsernameNotFoundException("Dados inválidos!");
    }
}
