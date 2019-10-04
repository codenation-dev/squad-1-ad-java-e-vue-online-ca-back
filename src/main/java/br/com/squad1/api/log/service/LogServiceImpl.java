package br.com.squad1.api.log.service;

import br.com.squad1.api.log.model.Log;
import br.com.squad1.api.log.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogServiceInterface {

    @Autowired
    LogRepository logRepository;
    
    public Log save(Log log) {
        return this.logRepository.save(log);
    }

    @Override
    public Iterable<Log> findAll() {
        return this.logRepository.findAll();
    }
    
    public Log findOneById(Long id) {
        return this.logRepository.findOneById(id);
    }
    
//    public Log findByOrigin() {
//        return this.logRepository.findOneById()
//    }
}
