package com.javaeplanet.library.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Bean
	public BCryptPasswordEncoder bcryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
@Override
protected void configure(HttpSecurity http) throws Exception {
	http.authorizeRequests().antMatchers("/","/saveBook","/showBookPage","/showLibrarianPage","/showReg","/showStudentReg","/saveStudent","/getAllBooks","/saveLibrarian","/showAccountPage","/showLibrarianReg","/loginPage","/getLogged").permitAll()
	.antMatchers("/getAccountDetails","/saveAccountDetails")
	.hasAnyAuthority("ADMIN").anyRequest().authenticated().and().csrf().disable();
	
}	

@Bean(name=BeanIds.AUTHENTICATION_MANAGER)
@Override
public AuthenticationManager authenticationManagerBean() throws Exception {
	// TODO Auto-generated method stub
	return super.authenticationManagerBean();
}	
}
