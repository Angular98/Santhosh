package com.fare.business;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.fare.business.authenticationdetails.CustomUserDetails;
import com.fare.business.authenticationdetails.Role;
import com.fare.business.repository.UserRepository;

@Configuration
public class FareCalculatorBusinessServiceBeanFactory {

	@Bean
	public void authenticationManager(AuthenticationManagerBuilder builder, UserRepository userRepo) throws Exception {

		Collection<? extends GrantedAuthority> authorities;
		List<GrantedAuthority> authDetails = new ArrayList<>();
		authDetails.add(new SimpleGrantedAuthority("USER"));
		authorities = authDetails;

		builder.inMemoryAuthentication().withUser("travel-api-client").password("psw");
		builder.userDetailsService(new UserDetailsService() {

			@Override
			public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

				return new CustomUserDetails(userRepo.findByUserName(username));
			}

		});
	}

}
