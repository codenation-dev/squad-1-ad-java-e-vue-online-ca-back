package br.com.squad1.api.config.security;

import br.com.squad1.api.usuario.model.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class TokenService {

    @Value("${api.jwt.expiration}")
    private String expiration;
    
    @Value("${api.jwt.secret}")
    private String secret;
    
    public String gerarToken(Authentication authentication) {
        
        User logado = (User) authentication.getPrincipal();
        Date hoje = new Date();
        Date dataExpiracao = new Date(hoje.getTime() + Long.parseLong(this.expiration));
        
        return Jwts.builder()
                .setIssuer("API Central de erros")
                .setSubject(logado.getId().toString())
                .setIssuedAt(hoje)
                .setExpiration(dataExpiracao)
                .signWith(SignatureAlgorithm.HS256, secret)
                .compact();
    }
}
