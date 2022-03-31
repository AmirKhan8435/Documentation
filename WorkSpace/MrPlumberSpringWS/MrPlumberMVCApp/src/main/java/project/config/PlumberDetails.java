package project.config;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import project.entities.PlumberInfoTbl;

public class PlumberDetails implements UserDetails {

	
	private PlumberInfoTbl plumber;
	
	public PlumberDetails(PlumberInfoTbl plumber)
	{
		super();
		this.plumber=plumber;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		SimpleGrantedAuthority simpleGrantedAuthority =	new SimpleGrantedAuthority("ROLE_PLUMBER");
		return List.of(simpleGrantedAuthority);
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return plumber.getPlumberPassword();
	}

	@Override
	public String getUsername() {
		
		return plumber.getPlumberUsername();
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
