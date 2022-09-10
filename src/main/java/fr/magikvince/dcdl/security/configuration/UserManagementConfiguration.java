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
	     String userByUsernameQuery = "select pseudo, password, is_enabled from T_USER where pseudo = ?";
	     String rolesByUserQuery =  
	    		 "select pseudo, role from T_ROLE r, T_USER u, T_USER_ROLE ur "
	     		+ "where pseudo = ? and u.id_user = ur.id_user_fk"
	     		+ "and r.id_role = ur.id_role_fk";
	        
         var userDetailsManager = new JdbcUserDetailsManager(dataSource);
        
         userDetailsManager.setUsersByUsernameQuery(userByUsernameQuery);
         userDetailsManager.setAuthoritiesByUsernameQuery(rolesByUserQuery);
	    
         return userDetailsManager;
	  }

	  @Bean
	  public PasswordEncoder passwordEncoder() {
	     return new BCryptPasswordEncoder();
	  }

}
