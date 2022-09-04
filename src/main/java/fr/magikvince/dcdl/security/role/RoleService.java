package fr.magikvince.dcdl.security.role;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.magikvince.dcdl.game.play.Player;

@Service
public class RoleService {
	
	@Autowired 
	RoleRepository roleRepository;

	public void createRole(Role role) throws RoleAlreadyExistException {
		// 
		if ( ! roleRepository.existsByRole(role.getRole()) )
			roleRepository.save(role);
		else
			throw new RoleAlreadyExistException();
	}

	public Role findRole(String role) throws RoleNotFoundException{
		return roleRepository.findByRole(role);
	}

	public Collection<Role> findAllRoles(){
		return (Collection<Role>) roleRepository.findAll();
	}
}
