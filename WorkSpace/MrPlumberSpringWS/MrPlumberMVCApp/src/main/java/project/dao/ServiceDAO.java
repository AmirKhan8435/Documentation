package project.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.entities.ServiceInfoTbl;
import project.repository.ServiceRepo;

@Service
public class ServiceDAO 
{
	@Autowired
	ServiceRepo serviceRepo;
	
	public void addservice(ServiceInfoTbl service)
	{
		System.out.println("in service Dao class");
		serviceRepo.save(service);
	}
	
}
