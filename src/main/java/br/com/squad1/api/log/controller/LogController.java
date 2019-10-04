package br.com.squad1.api.log.controller;

import br.com.squad1.api.log.controller.form.LogForm;
import br.com.squad1.api.log.model.Log;
import br.com.squad1.api.log.service.LogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

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
        catch(Exception e) {
            return new ResponseEntity<Log>(HttpStatus.CONFLICT);
        }
   }

    @CrossOrigin(origins = "*")
    @GetMapping
    public Iterable retornaListaLogsCadastrados() {
        return this.logServiceImpl.findAll();
    }

    @CrossOrigin(origins = "*")
    @GetMapping
    public Optional<Log> retornaLogDetalhado(Long logId) {
        return this.logServiceImpl.findById(logId);
    }
}
