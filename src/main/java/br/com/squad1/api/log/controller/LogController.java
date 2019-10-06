package br.com.squad1.api.log.controller;

import br.com.squad1.api.log.controller.form.LogForm;
import br.com.squad1.api.log.model.Log;
import br.com.squad1.api.log.service.LogServiceImpl;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logs")
public class LogController {
  
    @Autowired
    LogServiceImpl logServiceImpl;
    
    @CrossOrigin(origins = "*")
    @PostMapping
    public ResponseEntity<Log> cadastraLog(@RequestBody LogForm logForm) {        
        try {
            Log log = logForm.converter();
            this.logServiceImpl.save(log);
            return new ResponseEntity<Log>(HttpStatus.CREATED);
        }
        catch(Exception ex) {
            return new ResponseEntity<Log>(HttpStatus.CONFLICT);
        }
    }
  
    @CrossOrigin(origins = "*")
    @GetMapping
    public Iterable retornaListaLogsCadastrados() {
        return this.logServiceImpl.findAll();
    }
    
    @CrossOrigin(origins = "*")
    @GetMapping("/{id}")
    public Log findById(@PathVariable Long id) {
        return logServiceImpl.findOneById(id);
    }
}
