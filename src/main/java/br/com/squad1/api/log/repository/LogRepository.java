package br.com.squad1.api.log.repository;

import br.com.squad1.api.log.model.Log;
import br.com.squad1.api.usuario.model.User;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface LogRepository extends CrudRepository<Log, Long> {
    Log save(Log log);
    Iterable<Log> findAll();
}
