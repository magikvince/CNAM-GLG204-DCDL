package fr.magikvince.dcdl.security.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;

import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        
    	String[] staticResources = { "/img/**"};
    	
    	http.csrf().and().formLogin().loginPage("/logon")				// the custom login page
        	.defaultSuccessUrl("/")				// the landing page after a successful login
        	.and()								// possible : failureUrl() : the landing page after an unsuccessful login
        .logout()								// must be a POST with csrf on
        	.logoutSuccessUrl("/")
        	.and()
        .authorizeRequests()
        	.antMatchers(staticResources).permitAll()
        	.antMatchers("/", "/logon").permitAll()
        	.anyRequest().authenticated();
    	
    	return http.build();
    	
    }
    
    @Bean
    public UserDetailsService userDetailsService() {
            UserDetails user = User.withDefaultPasswordEncoder()
                    .username("admin@gmail.com")
                    .password("admin")
                    .roles("USER")
                    .build();
            return new InMemoryUserDetailsManager(user);
    }
    
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

