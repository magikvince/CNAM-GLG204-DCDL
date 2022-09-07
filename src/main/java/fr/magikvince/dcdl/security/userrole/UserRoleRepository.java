package fr.magikvince.dcdl.security.userrole;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.magikvince.dcdl.security.user.User;

@Repository
public interface UserRoleRepository extends CrudRepository<UserRole, Integer> 	{
		public Collection<UserRole> findAllRolesByUser(User user);

		public boolean existsByUserAndRole(String pseudo, String role);
}
