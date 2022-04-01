package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import project.dao.BookingDAO;
import project.entities.BookingTbl;

@Controller
public class BookingController 
{
	@Autowired
	BookingDAO bDao;
	
	@RequestMapping("/addbooking")
	public String customer()
	{
		System.out.println("in booking");
		return "addbooking";
	}
	
	@PostMapping("/addBooking")
	public String addBooking(@ModelAttribute BookingTbl booking,Model model)
	{
		System.out.println("in ajax");
		bDao.addBooking(booking);
		return "zalre";	
	}
	
}
