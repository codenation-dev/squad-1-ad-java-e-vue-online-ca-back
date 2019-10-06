package br.com.squad1.api.log.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "logs")
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size (max =  500)
    private String description;

    //IP de origem
    @NotNull
    @Size (max =  39) // Capacidade suficiente para um endereço IPv6
    private String origin;

    @NotNull
    @Size (max =  500)
    private String details;

    @Enumerated(EnumType.STRING)
    private TypeLevel level;

    @Column(columnDefinition = "timestamp default now()")
    @CreatedDate
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime createdAt;

    public Log() {

    }

    public Log(String description, String origin, String details, TypeLevel level) {
        this.description = description;
        this.origin = origin;
        this.details = details;
        this.level = level;
        this.createdAt = LocalDateTime.now();
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

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public TypeLevel getLevel() {
        return level;
    }

    public void setLevel(TypeLevel level) {
        this.level = level;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
