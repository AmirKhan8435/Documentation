package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import project.dao.CustomerDAO;
import project.entities.CustomerInfoTbl;
import project.entities.PlumberInfoTbl;
import project.repository.CustomerRepo;

@Controller
@SessionAttributes("customer")
public class CustomerController 
{
	@Autowired
	CustomerRepo customerRepo;
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
	
	@GetMapping("/home")
	
	
	@PostMapping("/customerlogin")
	
	public String signin(@RequestParam String username)
	{
		System.out.println(username);
		System.out.println("customerlogin");
		return "login";
	}
	
	@GetMapping("/customerbooking")
	public String customerbooking()
	{
		
		System.out.println("in customer");
		return "customerbooking";
	}
	
	
	@PostMapping("/addcustomertodb")
	public String addService(@ModelAttribute CustomerInfoTbl customer , Model model)
	{
		System.out.println("in ajax");
		customer.setCustomerPassword(passwordEncoder.encode(customer.getCustomerPassword()));
		custDAO.addCustomer(customer);
		return "index";	
	}
	
	@RequestMapping("/signincustumer")
	public String customerlogin2()
	{
		return "custumerlogin";
	}
	
	@PostMapping("/logincustomer")
	public String logincustomer(@RequestParam String username,@RequestParam String password,ModelMap model)
	{
		CustomerInfoTbl customer = customerRepo.getCustomerByName(username);
		model.put("customer", customer);
		if(customer== null)
		{
			return "custumerlogin";
		}
		return "index";
	}
	
	@RequestMapping("/customerDashbord")
	public String customerDashbord() {
		
		return "customerDashboard";
	}
	
}
