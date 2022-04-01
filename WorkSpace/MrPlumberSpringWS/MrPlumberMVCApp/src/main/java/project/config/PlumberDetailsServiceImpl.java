package project.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

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
