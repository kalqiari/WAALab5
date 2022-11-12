package edu.miu.lab5.repo;

import edu.miu.lab5.entity.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepo extends CrudRepository<Log, Long> {
}
