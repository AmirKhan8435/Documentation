package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.entities.BookingServiceMapTbl;

@Repository
public interface BookingServiceMapRepo extends JpaRepository<BookingServiceMapTbl, Integer>
{

}
