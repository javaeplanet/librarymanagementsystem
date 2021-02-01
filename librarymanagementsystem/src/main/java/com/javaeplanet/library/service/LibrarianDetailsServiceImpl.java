package com.javaeplanet.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.javaeplanet.library.entity.Librarian;
import com.javaeplanet.library.repos.LibrarianRepository;

@Service
public class LibrarianDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private LibrarianRepository repos;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Librarian librarian = repos.findByemail(username);
		if(librarian==null){
			throw new UsernameNotFoundException("Librarian not found for email"+username);
		}
		return new User(librarian.getEmail(),librarian.getPassword(),librarian.getRoles());
	}

}
