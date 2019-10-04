package br.com.squad1.api.log.service;

import br.com.squad1.api.log.model.Log;

import java.util.Optional;

public interface LogServiceInterface {
    Iterable<Log> findAll();
    Optional<Log> findById(Long logId);
}
