package fr.magikvince.dcdl.security.user;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.magikvince.dcdl.game.play.Player;

@Service
public class UserService {
	
	@Autowired 
	UserRepository userRepository;

	public void createUserByMail(User user) throws UserAlreadyExistException {
		// 
		if ( ! userRepository.existsByEmail(user.getEmail() ) )
			userRepository.save(user);
		else
			throw new UserAlreadyExistException();
	}
	
	public void createUserByPseudo(User user) throws UserAlreadyExistException {
		// 
		if ( ! userRepository.existsByPseudo(user.getPseudo() ) )
			userRepository.save(user);
		else
			throw new UserAlreadyExistException();
	}

	public User findUserByMail(String email) throws UserNotFoundException{
		return userRepository.findByEmail(email);
	}
	
	public User findUserByPseudo(String pseudo) throws UserNotFoundException{
		return userRepository.findByPseudo(pseudo);
	}

	public Collection<User> findAllUsers(){
		return (Collection<User>) userRepository.findAll();
	}
}
