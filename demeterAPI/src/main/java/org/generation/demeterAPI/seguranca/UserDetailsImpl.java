package org.generation.demeterAPI.seguranca;

import java.util.Collection;

import org.generation.demeterAPI.model.Usuario;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserDetailsImpl implements UserDetails{

	private static final long serialVersionUID = 1L;
	
	private long id;
	private String userName;
	private String password;
	private String foto;
	
	public UserDetailsImpl(Usuario user) {
		this.userName = user.getEmail();
		this.password = user.getSenha();
		this.id = user.getId();
		this.foto = user.getFoto();
	}
	
	public UserDetailsImpl() {}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return userName;
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
