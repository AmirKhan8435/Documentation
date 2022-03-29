package project.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import project.dao.PlumberDAO;
import project.entities.PlumberInfoTbl;

@Controller
public class PlumberController {

	@Autowired
	PlumberDAO plumberDAO;
	
<<<<<<< HEAD
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
=======
	@PostMapping("/addPlumberindata")
	public String addPlumber(@RequestParam String name,@RequestParam String last,@RequestParam String user,@RequestParam String pass,@RequestParam String address,@RequestParam int pincode,@RequestParam String aadhar,@RequestParam String phone,@RequestParam String jdate)
	{
		System.out.println("in controller");
	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date convertedCurrentDate=null;
		try {
			convertedCurrentDate = sdf.parse(jdate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		PlumberInfoTbl plumber=new PlumberInfoTbl();
		
		plumber.setPlumberFirstname(name);
		plumber.setPlumberLastname(last);
		plumber.setPlumberUsername(user);
		plumber.setPlumberPassword(pass);
		plumber.setPlumberAddress(address);
		plumber.setPlumberPincode(pincode);
		plumber.setPlumberAadharNo(aadhar);
		plumber.setPlumberPhone(phone);
		plumber.setPlumberJoindate(convertedCurrentDate);
		
		plumberDAO.addPlumber(plumber);
		
		return "zalre";
		
	}
>>>>>>> 9d61d01ce58d46e9d745c92c5b0981315d826b8f
	
	@RequestMapping("/addplumber")
	public String amir()
	{
		System.out.println("in amir");
<<<<<<< HEAD
		return "newaddPlumber";
=======
		return "newadd";
>>>>>>> 9d61d01ce58d46e9d745c92c5b0981315d826b8f
		
	}
	
	@PostMapping("/addajax")
	public String addPlumber(@RequestBody PlumberInfoTbl plumber)
	{
		System.out.println("in ajax");
	
		System.out.println(plumber.getPlumberAadharNo());
		plumberDAO.addPlumber(plumber);
		
		return "zalre";
		
	}
}
