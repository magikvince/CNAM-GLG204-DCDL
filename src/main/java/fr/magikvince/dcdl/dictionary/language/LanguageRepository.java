package fr.magikvince.dcdl.dictionary.language;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Integer> 	{

	public boolean existsByCodeLanguage(String codeLanguage);
	public Language findByCodeLanguage(String codeLanguage);
	

}
