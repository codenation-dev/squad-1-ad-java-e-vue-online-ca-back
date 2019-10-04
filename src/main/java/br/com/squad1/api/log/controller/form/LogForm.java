package br.com.squad1.api.log.controller.form;

import br.com.squad1.api.log.model.Log;
import br.com.squad1.api.log.model.TypeLevel;

import java.time.LocalDateTime;

public class LogForm {

    private String description;
    private String origin;
    private String details;
    private TypeLevel level;
    private LocalDateTime createdAt;

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

    public Log converter() {
        return new Log(this.description, this.origin, this.details, this.level);
    }
}
