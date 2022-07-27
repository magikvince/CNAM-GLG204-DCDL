package fr.magikvince.dcdl.dictionary.wordtype;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordTypeService {
	
	@Autowired 
	WordTypeRepository wordtyperepository;

	public void createWordType(WordType wordtype) throws WordTypeAlreadyExistException {
		// 
		if ( ! wordtyperepository.existsByTextWordType(wordtype.getTextWordType() ) )
			wordtyperepository.save(wordtype);
		else
			throw new WordTypeAlreadyExistException();
	}

	public WordType findByTextWordType(String textwordtype) throws WordTypeNotFoundException{
		return wordtyperepository.findByTextWordType(textwordtype);
	}
	
	public Collection<WordType> findAllWordTypes() {
		// TODO Auto-generated method stub
		return (Collection<WordType>) wordtyperepository.findAll();
	}
}
