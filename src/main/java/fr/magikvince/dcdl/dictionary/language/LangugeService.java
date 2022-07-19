package fr.magikvince.dcdl.dictionary.language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.magikvince.dcdl.game.play.Player;

@Service
public class LangugeService {
	
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

}
