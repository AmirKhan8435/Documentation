package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.entities.PlumberInfoTbl;

@Repository
public interface PlumberRepo extends JpaRepository<PlumberInfoTbl, Integer> {

}
