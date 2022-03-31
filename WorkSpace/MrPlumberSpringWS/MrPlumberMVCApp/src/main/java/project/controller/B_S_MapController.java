package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import project.dao.BSMapDAO;
import project.entities.BookingServiceMapTbl;

@Controller
public class B_S_MapController {

	@Autowired
	BSMapDAO bsmapDao;
	
	@RequestMapping("/addbsmap")
	public String bsmap()
	{
		System.out.println("in bsmap");
		return "bsmap";
	}
	
	@PostMapping("/addBSMap")
	public String addBSMap(@ModelAttribute BookingServiceMapTbl bsmap, Model model)
	{
		System.out.println("in ajax");
		bsmapDao.addBSMap(bsmap);
		return "zalre";	
	}
	
	
	
}
