package project.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import project.entities.CustomerInfoTbl;
import project.repository.CustomerRepo;

public class CustomerDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private CustomerRepo customerRepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		CustomerInfoTbl customer=customerRepo.getCustomerByName(username);
		
		if(customer ==null)
		{
			throw new UsernameNotFoundException("Could not found user ");
		}
		
		CustomerDetails CustomerDetails=new CustomerDetails(customer);
		
		return CustomerDetails ;
	}

}
