package fr.magikvince.dcdl.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
	
	@Autowired 
	PlayerRepository playerRepository;

	public void createPlayer(Player player) throws PlayerAlreadyExistException {
		// TODO Auto-generated method stub
		
		if ( ! playerRepository.existsByEmail(player.getEmail() ) )
			playerRepository.save(player);
		else
			throw new PlayerAlreadyExistException();
	}

	public Player findPlayer(String email) throws PlayerNotFoundException{
		// TODO Auto-generated method stub
		return playerRepository.findByEmail(email);
		
	}

}
