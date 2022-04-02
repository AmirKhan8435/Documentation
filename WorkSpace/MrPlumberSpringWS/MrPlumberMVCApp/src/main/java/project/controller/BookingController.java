package project.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.query.criteria.internal.expression.function.CurrentDateFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import project.dao.BSMapDAO;
import project.dao.BookingDAO;
import project.entities.BookingTbl;
import project.entities.PlumberInfoTbl;


@Controller
public class BookingController 
{
	@Autowired
	BookingDAO bookingDao;
	@Autowired
	BSMapDAO bsmapDao;
	@RequestMapping("/addbooking")
	public String customer()
	{
		System.out.println("in booking");
		return "addbooking";
	}
	
	@PostMapping("/addBooking")
	public ModelAndView addBooking(@ModelAttribute BookingTbl booking,Model model,HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		String [] service=request.getParameterValues("service");

		int [] serviceIds=new int[service.length];
		
		for (int i=0;i<service.length;i++) 
		{
			
			serviceIds[i]=Integer.parseInt(service[i]);
	    	
		}
		
		System.out.println("in ajax");
		booking.setBookingStatus("Pending");
		
		booking.setBookingTotalAmount(2000);
		bookingDao.addBooking(booking);
		
		/*
		 * if(service!=null) { for(int i=0;i<service.length;i++) {
		 * 
		 * } }
		 */
		
		mv.setViewName("customerDashboard");
		mv.addObject("custDash", booking);
		mv.addObject("name", "Shubham");
		mv.addObject("services", service[0]);
		return mv;	
		
	}
	
	
	
}
