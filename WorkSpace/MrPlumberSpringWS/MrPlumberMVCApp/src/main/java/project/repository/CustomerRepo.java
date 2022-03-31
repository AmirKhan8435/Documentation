package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import project.entities.CustomerInfoTbl;



@Repository
public interface CustomerRepo extends JpaRepository<CustomerInfoTbl, Integer> 
{
@Query("select c from CustomerInfoTbl c where c.customerUsername = :username")
public CustomerInfoTbl getCustomerByName(@Param("username") String username);
}
