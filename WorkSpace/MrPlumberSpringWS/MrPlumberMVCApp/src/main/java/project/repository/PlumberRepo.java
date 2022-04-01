package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import project.entities.PlumberInfoTbl;

@Repository
public interface PlumberRepo extends JpaRepository<PlumberInfoTbl, Integer> {
 @Query("select p from PlumberInfoTbl p where p.plumberUsername = :username")
 public PlumberInfoTbl getPlumberByName(@Param("username") String username);
}
