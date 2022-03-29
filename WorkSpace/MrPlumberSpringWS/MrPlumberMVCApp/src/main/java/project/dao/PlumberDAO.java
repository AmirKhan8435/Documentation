package project.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.entities.PlumberInfoTbl;
<<<<<<< HEAD
import project.entities.ServiceInfoTbl;
import project.repository.PlumberRepo;
import project.repository.ServiceRepo;
=======
import project.repository.PlumberRepo;
>>>>>>> 9d61d01ce58d46e9d745c92c5b0981315d826b8f

@Service
public class PlumberDAO {
	
	@Autowired
<<<<<<< HEAD
	PlumberRepo plumberRepo;
	@Autowired
	ServiceRepo serviceRepo;

	public void addPlumber(PlumberInfoTbl plumber)
	{
		plumberRepo.save(plumber);
	}
	
	public void addservice(ServiceInfoTbl service)
	{
		System.out.println(service.getServiceName());
		serviceRepo.save(service);
=======
	PlumberRepo repo1;

	public void addPlumber(PlumberInfoTbl plumber)
	{
		repo1.save(plumber);
>>>>>>> 9d61d01ce58d46e9d745c92c5b0981315d826b8f
	}
}
