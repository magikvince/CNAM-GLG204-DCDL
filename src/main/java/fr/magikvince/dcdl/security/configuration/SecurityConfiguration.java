package fr.magikvince.dcdl.security.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;

import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SuppressWarnings("deprecation")
@Configuration
public class SecurityConfiguration extends  WebSecurityConfigurerAdapter
{

	  @Override
	  protected void configure(HttpSecurity http) throws Exception {
	        http.authorizeRequests()
	                .antMatchers("/logon").permitAll()
	                .anyRequest().authenticated()
	                .and()
	                .formLogin().loginPage("/logon");
	    }
	 
	  @Override
	  public void configure(WebSecurity web) throws Exception {
	        web.ignoring().antMatchers("/webjars/**", "/images/**", "/css/**");
	  }
}
