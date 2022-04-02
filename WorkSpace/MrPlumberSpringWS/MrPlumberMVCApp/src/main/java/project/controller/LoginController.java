package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import project.entities.CustomerInfoTbl;
import project.repository.CustomerRepo;

@Controller
@SessionAttributes("custumer")
public class LoginController {

	@Autowired
	CustomerRepo customerRepo;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	@RequestMapping("/signin2")
	public String sinin2()
	{
		return "loginoption";
	}
	
	
	
	@RequestMapping("/index")
	public String index()
	{
		return "index";
	}
	
	
}
