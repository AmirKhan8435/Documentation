package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.entities.BookingTbl;

@Repository
public interface BookingRepo extends JpaRepository<BookingTbl, Integer>
{

}
