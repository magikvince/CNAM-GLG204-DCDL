package fr.magikvince.dcdl.security.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

@Configuration
public class UserManagementConfiguration 
{
	  @Bean
	  public UserDetailsService userDetailsService(DataSource dataSource) 
	  {
	     String usersByUsernameQuery = "select pseudo, password, is_enable from T_USERS where pseudo = ?";
	     String authsByUserQuery =  
	    		 "select pseudo, authority from T_AUTHORITIES a, T_USERS u"
	     		+ "where pseudo = ? and u.id_user = a.id_user_fk";
	        
         var userDetailsManager = new JdbcUserDetailsManager(dataSource);
        
         userDetailsManager.setUsersByUsernameQuery(usersByUsernameQuery);
         userDetailsManager.setAuthoritiesByUsernameQuery(authsByUserQuery);
	    
         return userDetailsManager;
	  }

	  @Bean
	  public PasswordEncoder passwordEncoder() {
	     return new BCryptPasswordEncoder();
	  }

}
