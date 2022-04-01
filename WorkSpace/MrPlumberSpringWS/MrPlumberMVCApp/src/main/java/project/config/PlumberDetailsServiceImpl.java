package project.config;

import java.net.http.HttpRequest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import project.entities.CustomerInfoTbl;
import project.entities.PlumberInfoTbl;
import project.repository.CustomerRepo;
import project.repository.PlumberRepo;


public class PlumberDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private  PlumberRepo plumberRepo;
	@Autowired
	private  CustomerRepo customerRepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		
		PlumberInfoTbl plumber=plumberRepo.getPlumberByName(username);
		
		
		
		System.out.println("sessionmanagement");
		if(plumber ==null)
		{
			CustomerInfoTbl customer=customerRepo.getCustomerByName(username);
		
			
			CustomerDetails customerDetails=new CustomerDetails(customer);
			
			return customerDetails; 
			//throw new UsernameNotFoundException("Could not found user ");
		}
		
		
		PlumberDetails plumberDetails=new PlumberDetails(plumber);
		
		return plumberDetails ;
	}

}
