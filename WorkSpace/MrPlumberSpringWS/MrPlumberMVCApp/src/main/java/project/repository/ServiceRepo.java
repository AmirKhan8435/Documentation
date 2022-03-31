package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.entities.ServiceInfoTbl;

@Repository
public interface ServiceRepo extends JpaRepository<ServiceInfoTbl, Integer>{

}
