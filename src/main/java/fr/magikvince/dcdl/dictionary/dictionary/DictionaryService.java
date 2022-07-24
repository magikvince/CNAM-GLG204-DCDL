package fr.magikvince.dcdl.dictionary.dictionary;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictionaryService {
	
	@Autowired 
	DictionaryRepository dictionaryRepository;

	public void createDictionary(Dictionary dictionary) throws DictionaryAlreadyExistException {
		// 
		if ( ! dictionaryRepository.existsByPseudo(author.getPseudo() ) )
			dictionaryRepository.save(author);
		else
			throw new DictionaryAlreadyExistException();
	}

	public Author findAuthor(String pseudo) throws AuthorNotFoundException{
		return dictionaryRepository.findByPseudo(pseudo);
	}

	public Collection<Dictionary> findAllDictionaries() {
		// TODO Auto-generated method stub
		return (Collection<Dictionary>) dictionaryRepository.findAll();
	}

}
