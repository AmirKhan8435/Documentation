package project.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.entities.BookingTbl;
import project.repository.BookingRepo;

@Service
public class BookingDAO 
{
	@Autowired
	BookingRepo bookingRepo;
	
	
	public void addBooking(BookingTbl booking)
	{
		bookingRepo.save(booking);
	}
	
	
	
}
