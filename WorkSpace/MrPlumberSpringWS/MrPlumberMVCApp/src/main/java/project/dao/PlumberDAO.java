package project.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.entities.PlumberInfoTbl;

import project.entities.ServiceInfoTbl;
import project.repository.PlumberRepo;
import project.repository.ServiceRepo;
import project.repository.PlumberRepo;

@Service
public class PlumberDAO {
	
	@Autowired
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
	    PlumberRepo repo1;

	}
}
