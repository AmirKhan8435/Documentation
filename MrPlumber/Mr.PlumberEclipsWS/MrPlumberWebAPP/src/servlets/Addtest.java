package servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PlumberDAO;
import entity.PlumberInfoTbl;
import pojo.Plumber;

@WebServlet("/Addtest")
public class Addtest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		String name= request.getParameter("name");
		String lastname= request.getParameter("last");
		String username= request.getParameter("user");
		String password= request.getParameter("pass");
		String address= request.getParameter("address");
		String pincode1= request.getParameter("pincode");
		String aadhar= request.getParameter("aadhar");
		String phone= request.getParameter("phone");
		String date1= request.getParameter("date");
		
		System.out.println(date1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date convertedCurrentDate=null;
		try {
			convertedCurrentDate = sdf.parse(date1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String date=sdf.format(convertedCurrentDate );
		int pincode=Integer.parseInt(pincode1);
		
		PlumberInfoTbl plumber = new PlumberInfoTbl();
		
		plumber.setPlumberId(1);
		plumber.setPlumberFirstname(name);
		plumber.setPlumberLastname(lastname);
		plumber.setPlumberUsername(username);
		plumber.setPlumberPassword(password);
		plumber.setPlumberAddress(address);
		plumber.setPlumberPincode(pincode);
		plumber.setPlumberAadharNo(aadhar);
		plumber.setPlumberPhone(phone);
		plumber.setPlumberJoindate(convertedCurrentDate);
		
		PlumberDAO dao=new PlumberDAO();
		
		dao.addPlumber(plumber);
		
		response.getWriter().print("zala re....");
	}
	

}
