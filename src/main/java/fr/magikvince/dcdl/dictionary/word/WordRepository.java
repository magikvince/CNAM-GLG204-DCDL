package fr.magikvince.dcdl.dictionary.word;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordRepository extends CrudRepository<Word, Integer> 	{

	public boolean existsByTextWord(String word);
	public Word findByTextWord(String word);
	

}
