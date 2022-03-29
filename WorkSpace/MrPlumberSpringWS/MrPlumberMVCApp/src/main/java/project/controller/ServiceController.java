package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import project.dao.PlumberDAO;
import project.entities.PlumberInfoTbl;
import project.entities.ServiceInfoTbl;

@Controller
public class ServiceController {
	
	@Autowired
	PlumberDAO plumberDAO;
	
	@RequestMapping("/addservice")
	public String service()
	{
		System.out.println("in service");
		return "newaddService";
		
	}
	
	@PostMapping("/addserviceindata")
	public String addPlumber(@RequestBody ServiceInfoTbl service)
	{
		System.out.println("in ajax");
	
		System.out.println(service.getServiceAmount());
		plumberDAO.addservice(service);
		
		return "zalre";
		
	}
}
