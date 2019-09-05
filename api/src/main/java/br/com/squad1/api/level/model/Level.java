package br.com.squad1.api.level.model;

import br.com.squad1.api.level.enums.LevelsEnum;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Level {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    private LevelsEnum level;
    
    public Level() {
        
    }
}
