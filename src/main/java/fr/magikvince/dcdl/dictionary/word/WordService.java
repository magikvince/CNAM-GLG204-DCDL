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
		if ( ! wordRepository.existsByTextWord(word.getTextWord() ) )
			wordRepository.save(word);
		else
			throw new WordAlreadyExistException("word " + word.getTextWord() + " already exist in dictionary");
	}

	public Word findWordByWord(String word) throws WordNotFoundException{
		return wordRepository.findByTextWord(word);
	}
	
	public Collection<Word> findAllWords() {
		// TODO Auto-generated method stub
		return (Collection<Word>) wordRepository.findAll();
	}
}
