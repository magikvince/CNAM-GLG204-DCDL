package fr.magikvince.dcdl.dictionary.author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.magikvince.dcdl.game.play.Player;

@Service
public class AuthorService {
	
	@Autowired 
	AuthorRepository authorRepository;

	public void createAuthor(Author author) throws AuthorAlreadyExistException {
		// 
		if ( ! authorRepository.existsByPseudo(author.getPseudo() ) )
			authorRepository.save(author);
		else
			throw new AuthorAlreadyExistException();
	}

	public Author findAuthor(String pseudo) throws AuthorNotFoundException{
		return authorRepository.findByPseudo(pseudo);
	}

}
