package br.com.squad1.api.log.service;

import br.com.squad1.api.log.model.Log;

public interface LogServiceInterface {
    Iterable<Log> findAll();
    Log findOneById(Long id);
}
