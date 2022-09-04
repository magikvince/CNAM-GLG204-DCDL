package fr.magikvince.dcdl.security.role;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> 	{

	public boolean existsByRole(String role);
	public Role findByRole(String role);
}
