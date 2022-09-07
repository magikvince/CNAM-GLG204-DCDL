package fr.magikvince.dcdl.security;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import fr.magikvince.dcdl.security.user.User;
import fr.magikvince.dcdl.security.user.UserAlreadyExistException;
import fr.magikvince.dcdl.security.user.UserNotFoundException;
import fr.magikvince.dcdl.security.user.UserRepository;
import fr.magikvince.dcdl.security.user.UserService;

public class CreateUserTest {


	@Autowired 
	UserService userservice;
	
	@Autowired
	UserRepository userRepository;
	
	@Test
	public void CreateUser()
	{
		User user = new User();
		user.setEnabled(true);
		user.setPseudo("testuser1");
		user.setEmail("testuser1@gmail.com");
		user.setFirstname("Vincent");
		user.setLastname("NAVARRO");
		user.setCity("MELUN");
		user.setPassword("password");
		user.setCountry("FRANCE");
		
		user.setCreationDateTime(LocalDateTime.now());
		
		user.setBirthdate("1978-03-16");
		
		System.out.println("user : " + user);
		try {
			userservice.createUser(user);
		} catch (UserAlreadyExistException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertTrue(userRepository.existsByEmail(user.getEmail()));
		
		User usercreated = null;
		try {
			usercreated = userservice.findUserByMail(user.getEmail());
		} catch (UserNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(user.getPseudo(), usercreated.getPseudo());
		assertEquals(user.getFirstname(), usercreated.getFirstname());
		assertEquals(user.getLastname(), usercreated.getLastname());
		
	}
	
}
