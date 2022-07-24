package fr.magikvince.dcdl.dictionary.word;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordRepository extends CrudRepository<Word, Integer> 	{

	public boolean existsByWord(String word);
	public Word findByWord(String word);
	

}
