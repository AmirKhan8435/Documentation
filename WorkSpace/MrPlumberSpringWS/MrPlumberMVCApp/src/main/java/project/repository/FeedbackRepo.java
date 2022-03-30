package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.entities.FeedbackTbl;


@Repository
public interface FeedbackRepo extends JpaRepository<FeedbackTbl, Integer> 
{

}
