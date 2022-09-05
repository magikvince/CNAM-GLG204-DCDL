package fr.magikvince.dcdl.security.connection;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.magikvince.dcdl.game.play.Player;
import fr.magikvince.dcdl.security.user.User;

@Service
public class ConnectionService {
	
	@Autowired 
	ConnectionRepository connectionRepository;

	public void createConnection(Connection connection)  {
		// 
		connectionRepository.save(connection);
	}

	public Connection findConnection(User user) throws ConnectionNotFoundException{
		return connectionRepository.findByUser(user);
	}

	public Collection<Connection> findAllConnections(){
		return (Collection<Connection>) connectionRepository.findAll();
	}
}
