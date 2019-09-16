package br.com.squad1.api.log.controller.form;

import br.com.squad1.api.level.model.Level;
import br.com.squad1.api.log.model.Log;

public class LogForm {

    private String description;
    private String origin;
    private Integer totalEvents;
    private String details;
    private Level level;

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

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    
    public Log converter() {
        return new Log(this.description, this.origin, this.totalEvents, this.details, new Level());
    }
}
