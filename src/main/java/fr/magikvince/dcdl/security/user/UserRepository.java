package fr.magikvince.dcdl.security.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> 	{

	public boolean existsByEmail(String email);
	public User findByEmail(String email);
	public User findByPseudo(String pseudo);
	

}
