package project.config;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import project.entities.CustomerInfoTbl;

public class CustomerDetails implements UserDetails {

	private CustomerInfoTbl customer;
	
	CustomerDetails(CustomerInfoTbl customer)
	{
		this.customer=customer;
	}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		SimpleGrantedAuthority simpleGrantedAuthority =	new SimpleGrantedAuthority("ROLE_CUSTOMER");
		return List.of(simpleGrantedAuthority);
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return customer.getCustomerPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return customer.getCustomerUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
