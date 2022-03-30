package project.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.entities.PlumberInfoTbl;
import project.repository.PlumberRepo;

@Service
public class PlumberDAO {
	
	@Autowired
	PlumberRepo plumberRepo;

	public void addPlumber(PlumberInfoTbl plumber)
	{
		plumberRepo.save(plumber);
	}
	
	
}
