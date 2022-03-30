package project.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.entities.CustomerInfoTbl;
import project.repository.CustomerRepo;

@Service
public class CustomerDAO 
{
	@Autowired
	CustomerRepo CustRepo;
	
	public void addCustomer(CustomerInfoTbl customer)
	{
		System.out.println("in CustomerDAO class");
		CustRepo.save(customer);
	}
	
}
