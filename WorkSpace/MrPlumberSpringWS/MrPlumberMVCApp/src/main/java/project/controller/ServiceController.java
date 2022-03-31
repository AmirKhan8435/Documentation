package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import project.dao.ServiceDAO;
import project.entities.ServiceInfoTbl;

@Controller
public class ServiceController {
	
	@Autowired
	ServiceDAO serviceDao;
	
	@RequestMapping("/addservice")
	public String service()
	{
		System.out.println("in service");
		return "newaddService";
		
	}
	
	@PostMapping("/addserviceindata")
	public String addService(@ModelAttribute ServiceInfoTbl service,Model model)
	{
		System.out.println("in ajax");
		serviceDao.addservice(service);
		return "zalre";
		
	}
}
