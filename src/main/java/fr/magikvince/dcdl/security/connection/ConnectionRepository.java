package fr.magikvince.dcdl.security.connection;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.magikvince.dcdl.security.user.User;

@Repository
public interface ConnectionRepository extends CrudRepository<Connection, Integer> 	{

	public Connection findByUser(User user);
}
