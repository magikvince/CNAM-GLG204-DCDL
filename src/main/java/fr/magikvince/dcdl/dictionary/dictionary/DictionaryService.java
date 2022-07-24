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
		if ( ! dictionaryRepository.existsByName(dictionary.getName() ) )
			dictionaryRepository.save(dictionary);
		else
			throw new DictionaryAlreadyExistException();
	}

	public Dictionary findDictionary(String name) throws DictionaryNotFoundException{
		return dictionaryRepository.findByName(name);
	}

	public Collection<Dictionary> findAllDictionaries() {
		// TODO Auto-generated method stub
		return (Collection<Dictionary>) dictionaryRepository.findAll();
	}

}
