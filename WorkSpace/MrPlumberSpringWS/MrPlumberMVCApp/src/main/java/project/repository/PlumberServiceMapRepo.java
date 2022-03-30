package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.entities.PlumberServiceMapTbl;

@Repository
public interface PlumberServiceMapRepo extends JpaRepository<PlumberServiceMapTbl, Integer>
{

}
