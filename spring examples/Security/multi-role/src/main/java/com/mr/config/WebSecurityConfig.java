package com.mr.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.mr.security.handler.CsrAuthenticationSuccessHandler;
import com.mr.security.service.CsrDetailsServiceImpl;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private CsrDetailsServiceImpl csrDetailsServiceImpl;

	@Autowired
	private CsrAuthenticationSuccessHandler csrAuthenticationSuccessHandler;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.authorizeRequests().antMatchers("/csr-dashboard.htm").hasAuthority("csr")
				.antMatchers("/tech-dashboard.htm").hasAuthority("technician").and().formLogin().loginPage("/login.htm")
				.loginProcessingUrl("/csr-security-check").usernameParameter("j_user").passwordParameter("j_password")
				.successHandler(csrAuthenticationSuccessHandler);

	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(csrDetailsServiceImpl).passwordEncoder(passwordEncoder);
	}

	/*public static void main(String[] args) {
		PasswordEncoder encoder = new  BCryptPasswordEncoder();
		System.out.println(encoder.encode("welcome1"));
	}
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
