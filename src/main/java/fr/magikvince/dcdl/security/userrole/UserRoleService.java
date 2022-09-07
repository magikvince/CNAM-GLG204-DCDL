package fr.magikvince.dcdl.security.userrole;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.magikvince.dcdl.game.play.Player;
import fr.magikvince.dcdl.security.user.User;

@Service
public class UserRoleService {
	
	@Autowired 
	UserRoleRepository userRoleRepository;
	
	public void createUserRole(UserRole userRole) throws UserRoleAlreadyExistException {
		// 
		if ( ! userRoleRepository.existsByUserAndRole(userRole.getPseudo(), userRole.getRoleName()) )
			userRoleRepository.save(userRole);
		else
			throw new UserRoleAlreadyExistException();
	}

	//let's find all Roles for a given User
	public Collection<UserRole> findAllRolesByUser( User user){
		return (Collection<UserRole>) userRoleRepository.findAllRolesByUser(user);
	}
	
	//let's find all UserRole objects = a couple ( User, Role )
	public Collection<UserRole> findAllUserRole(){
		return (Collection<UserRole>) userRoleRepository.findAll();
	}
}
