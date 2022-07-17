package fr.magikvince.dcdl.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.magikvince.dcdl.game.play.Player;

@Service
public class UserService {
	
	@Autowired 
	UserRepository userRepository;

	public void createUser(User user) throws UserAlreadyExistException {
		// 
		if ( ! userRepository.existsByEmail(user.getEmail() ) )
			userRepository.save(user);
		else
			throw new UserAlreadyExistException();
	}

	public User findUser(String email) throws UserNotFoundException{
		return userRepository.findByEmail(email);
	}

}
