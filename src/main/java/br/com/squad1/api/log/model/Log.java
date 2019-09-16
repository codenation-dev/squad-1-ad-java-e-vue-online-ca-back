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
    @Size (max =  500)
    private String description;

    //IP de origem
    @NotNull
    @Size (max =  50)
    private String origin;

    @NotNull
    private Integer totalEvents;

    @NotNull
    @Size (max =  500)
    private String details;
    
    //Falta relacionamento com tabela Levels
    
    //Falta atributo created_at 
    
    public Log() {
      
    }

    public Log(String description, String origin, Integer totalEvents, String details) {
        this.description = description;
        this.origin = origin;
        this.totalEvents = totalEvents;
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

    public Integer getTotalEvents() {
        return totalEvents;
    }

    public void setTotalEvents(Integer totalEvents) {
        this.totalEvents = totalEvents;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
