package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import project.dao.PSMapDAO;
import project.entities.PlumberServiceMapTbl;
import project.entities.ServiceInfoTbl;
import project.repository.PlumberServiceMapRepo;

@Controller
@CrossOrigin
public class P_S_MapController 
{
	@Autowired
	PSMapDAO psDao;
	
	@RequestMapping("/addpsmap")
	public String psmap()
	{
		System.out.println("in ps_map");
		return "psmap";	
	}
	
	@PostMapping("/addpsmapdata")
	public String addPSMap(@ModelAttribute PlumberServiceMapTbl psmapdata , Model model)
	{
		System.out.println("in ajax");
		psDao.addpsmap(psmapdata);
		return "zalre";
	}
}
