package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.entities.CustomerInfoTbl;


@Repository
public interface CustomerRepo extends JpaRepository<CustomerInfoTbl, Integer> 
{

}
