package project.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import project.dao.PlumberDAO;
import project.entities.PlumberInfoTbl;
import project.repository.PlumberRepo;

@Controller
@SessionAttributes("plumber")
public class PlumberController {

	@Autowired
	PlumberRepo plumberRepo;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	@Autowired
	PlumberDAO plumberDAO;
	

	/*
	 * @PostMapping("/addPlumberindata") public String addPlumber(@RequestParam
	 * String name,@RequestParam String last,@RequestParam String user,@RequestParam
	 * String pass,@RequestParam String address,@RequestParam int
	 * pincode,@RequestParam String aadhar,@RequestParam String phone,@RequestParam
	 * String jdate) { System.out.println("in controller");
	 * 
	 * SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); Date
	 * convertedCurrentDate=null; try { convertedCurrentDate = sdf.parse(jdate); }
	 * catch (ParseException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * PlumberInfoTbl plumber=new PlumberInfoTbl();
	 * 
	 * plumber.setPlumberFirstname(name); plumber.setPlumberLastname(last);
	 * plumber.setPlumberUsername(user); plumber.setPlumberPassword(pass);
	 * plumber.setPlumberAddress(address); plumber.setPlumberPincode(pincode);
	 * plumber.setPlumberAadharNo(aadhar); plumber.setPlumberPhone(phone);
	 * plumber.setPlumberJoindate(convertedCurrentDate);
	 * 
	 * plumberDAO.addPlumber(plumber);
	 * 
	 * return "zalre";
	 * 
	 * }
	 */
	/*
	 * @PostMapping("/addPlumberindata") public String addPlumber(@RequestParam
	 * String name,@RequestParam String last,@RequestParam String user,@RequestParam
	 * String pass,@RequestParam String address,@RequestParam int
	 * pincode,@RequestParam String aadhar,@RequestParam String phone,@RequestParam
	 * String jdate) { System.out.println("in controller");
	 * 
	 * SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); Date
	 * convertedCurrentDate=null; try { convertedCurrentDate = sdf.parse(jdate); }
	 * catch (ParseException e) {e.printStackTrace();}
	 * 
	 * PlumberInfoTbl plumber=new PlumberInfoTbl();
	 * 
	 * plumber.setPlumberFirstname(name); plumber.setPlumberLastname(last);
	 * plumber.setPlumberUsername(user); plumber.setPlumberPassword(pass);
	 * plumber.setPlumberAddress(address); plumber.setPlumberPincode(pincode);
	 * plumber.setPlumberAadharNo(aadhar); plumber.setPlumberPhone(phone);
	 * plumber.setPlumberJoindate(convertedCurrentDate);
	 * 
	 * plumberDAO.addPlumber(plumber);
	 * 
	 * return "zalre";
	 * 
	 * }
	 */
	
	@RequestMapping("/signin")
	public String signin()
	{
		
		return "login";
	}
	
	@PostMapping("/home")
	public String home(@RequestParam String username,ModelMap model)
	{
		PlumberInfoTbl plumber=plumberRepo.getPlumberByName(username);
		model.put("plumber", plumber);
		System.out.println("home");
		return "index";
	}
	
	@RequestMapping("/addplumber")
	public String amir()
	{
		
		
		System.out.println("in amir");
		return "newaddPlumber";
		
	}
	
	@PostMapping()
	public ModelAndView addPlumber(@ModelAttribute PlumberInfoTbl plumber,Model model)
	{
		ModelAndView mv = new ModelAndView();
		plumberDAO.addPlumber(plumber);
		System.out.println("in ajax");
	    plumber.setPlumberPassword(passwordEncoder.encode(plumber.getPlumberPassword()));
	    //mv.addObject("plumber", plumber);
		System.out.println(plumber.getPlumberJoindate());
		
		mv.setViewName("zalre");
		return mv;
		
	}
}
