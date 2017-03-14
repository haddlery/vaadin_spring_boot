package edu.fusion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface TodoRepository extends JpaRepository<Todo, Long>{

    @Transactional
    void deleteByDone(boolean done);
}
