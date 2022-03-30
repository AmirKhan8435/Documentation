package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import project.dao.CustomerDAO;
import project.entities.CustomerInfoTbl;

@Controller
public class CustomerController 
{
	@Autowired
	CustomerDAO custDAO;
	
	@RequestMapping("/addcust")
	public String customer()
	{
		System.out.println("in customer");
		return "addcustomer";
	}
	
	@PostMapping("/addCustomer")
	public String addService(@RequestBody CustomerInfoTbl customer)
	{
		System.out.println("in ajax");
		custDAO.addCustomer(customer);
		return "zalre";	
	}
	
}
