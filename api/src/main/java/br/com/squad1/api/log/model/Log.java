package br.com.squad1.api.log.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Log {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size (max =  512)
    private String description;
    
    @NotNull
    @Size (max =  39)
    private String origin;
    
    @NotNull
    private int numberEvents;
    
    @NotNull
    @Size (max =  512)
    private String details;
    
    //Falta inserir aqui o relaciomanento com "Level".

    
    public Log() {
        
    }
    
    public Log(String description, String origin, int numberEvents, String details) {
        this.description = description;
        this.origin = origin;
        this.numberEvents = numberEvents;
        this.details = details;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getNumberEvents() {
        return numberEvents;
    }

    public void setNumberEvents(int numberEvents) {
        this.numberEvents = numberEvents;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
