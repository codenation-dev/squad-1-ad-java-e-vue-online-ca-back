package br.com.squad1.api.log.controller.form;

import br.com.squad1.api.log.model.Log;

public class LogForm {

    private String description;
    private String origin;    
    private int numberEvents;
    private String details;

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

    public Log converter() {
      return new Log(this.description, this.origin, this.numberEvents, this.details);
    }
}
