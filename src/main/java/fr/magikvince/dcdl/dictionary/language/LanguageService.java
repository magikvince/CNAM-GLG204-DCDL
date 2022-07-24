package fr.magikvince.dcdl.dictionary.language;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LanguageService {
	
	@Autowired 
	LanguageRepository languageRepository;

	public void createLanguage(Language language) throws LanguageAlreadyExistException {
		// 
		if ( ! languageRepository.existsByCodeLanguage(language.getCodeLanguage() ) )
			languageRepository.save(language);
		else
			throw new LanguageAlreadyExistException();
	}

	public Language findLanguage(String codeLanguage) throws LanguageNotFoundException{
		return languageRepository.findByCodeLanguage(codeLanguage);
	}
	
	public Collection<Language> findAllLanguage() {
		// TODO Auto-generated method stub
		return (Collection<Language>) languageRepository.findAll();
	}

}
