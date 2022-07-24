package fr.magikvince.dcdl.dictionary.word;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordService {
	
	@Autowired 
	WordRepository wordRepository;

	public void createWord(Word word) throws WordAlreadyExistException {
		// 
		if ( ! wordRepository.existsByWord(word.getWord() ) )
			wordRepository.save(word);
		else
			throw new WordAlreadyExistException();
	}

	public Word findWordByWord(String word) throws WordNotFoundException{
		return wordRepository.findByWord(word);
	}
	
	public Collection<Word> findAllWords() {
		// TODO Auto-generated method stub
		return (Collection<Word>) wordRepository.findAll();
	}
}
