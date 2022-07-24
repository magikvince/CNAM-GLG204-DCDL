package fr.magikvince.dcdl.dictionary.dictionary;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DictionaryRepository extends CrudRepository<Dictionary, Integer> 	{

	public boolean existsByName(String name);
	public Dictionary findByName(String name);
}
