package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import project.dao.CustomerDAO;
import project.entities.CustomerInfoTbl;

@Controller
public class CustomerController 
{
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	@Autowired
	CustomerDAO custDAO;
	
	@RequestMapping("/customeradd")
	public String customer()
	{
		System.out.println("in customer");
		return "addcustomer";
	}
	
	@PostMapping("/addCustomer")
	public String addService(@ModelAttribute CustomerInfoTbl customer , Model model)
	{
		System.out.println("in ajax");
		customer.setCustomerPassword(passwordEncoder.encode(customer.getCustomerPassword()));
		custDAO.addCustomer(customer);
		return "zalre";	
	}
	
}
