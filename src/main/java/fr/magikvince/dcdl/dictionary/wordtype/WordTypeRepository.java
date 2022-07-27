package fr.magikvince.dcdl.dictionary.wordtype;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordTypeRepository extends CrudRepository<WordType, Integer> 	{

	public boolean existsByTextWordType(String textwordtype);
	public WordType findByTextWordType(String textwordtype);
	public Collection<WordType> findAllWordTypes();
}
