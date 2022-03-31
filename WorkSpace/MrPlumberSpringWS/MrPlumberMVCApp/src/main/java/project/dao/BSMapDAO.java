package project.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.entities.BookingServiceMapTbl;
import project.repository.BookingServiceMapRepo;

@Service
public class BSMapDAO 
{
	@Autowired
	BookingServiceMapRepo bsmapRepo;
	
	public void addBSMap(BookingServiceMapTbl bsmap)
	{
		bsmapRepo.save(bsmap);
	}
	
	
}
