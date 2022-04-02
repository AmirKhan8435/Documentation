package project.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
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
import project.entities.CustomerInfoTbl;
import project.entities.PlumberInfoTbl;
import project.entities.PlumberServiceMapTbl;
import project.entities.ServiceInfoTbl;
import project.repository.PlumberRepo;
import project.repository.PlumberServiceMapRepo;

@Controller
@SessionAttributes("plumber")
public class PlumberController {

	@Autowired
	PlumberServiceMapRepo psmapRepo;
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
	
	@RequestMapping("/plumberlogin")
	public String plumberlogin()
	{
		System.out.println("plumberlogin");
		return "login";
	}
	
	@RequestMapping("/signin")
	public String signin()
	{
		
		System.out.println("signin");
		return "login";
	}
	
	
	@GetMapping("/")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping("/addplumber")
	public String amir()
	{
		
		
		System.out.println("in amir");
		return "newaddPlumber";
		
	}
	
	@RequestMapping("/signinplumber")
	public String customerlogin2()
	{
		return "plumberlogin";
	}
	
	@PostMapping("/loginplumber")
	public String logincustomer(@RequestParam String username,@RequestParam String password,ModelMap model)
	{
		PlumberInfoTbl plumber = plumberRepo.getPlumberByName(username);
		model.put("customer", plumber);
		if(plumber== null)
		{
			return "plumberlogin";
		}
		return "index";
	}
	
	
	@PostMapping("/addplumbertodb")
	public String addPlumber(@ModelAttribute PlumberInfoTbl plumber,Model model,HttpServletRequest req)
	{
		String[] services = req.getParameterValues("service");
		int [] serviceIds=new int[services.length];
		
		for (int i=0;i<services.length;i++) 
		{
			
			serviceIds[i]=Integer.parseInt(services[i]);
	    	
		}
		
		System.out.println("plumber to db");
		
	    plumber.setPlumberPassword(passwordEncoder.encode(plumber.getPlumberPassword()));
	    plumberDAO.addPlumber(plumber);
	    
	    PlumberInfoTbl foundPlumber = plumberRepo.getPlumberByName(plumber.getPlumberUsername());
	   
	    int plumberID=foundPlumber.getPlumberId();
	    
	    PlumberInfoTbl plumberId=new PlumberInfoTbl(plumberID);
	    
	    for (int sid : serviceIds) {
			
	    	ServiceInfoTbl serviceId=new ServiceInfoTbl(sid);
	    	PlumberServiceMapTbl psMap= new PlumberServiceMapTbl(plumberId,serviceId);
	    	
	    	
	    	psmapRepo.save(psMap);
	    	
		}
		return "index";
		
	}
	
	@RequestMapping("/plumberDashbord")
	public String plumberDashbord() {
		
		return "plumberDashbord";
	}
}
