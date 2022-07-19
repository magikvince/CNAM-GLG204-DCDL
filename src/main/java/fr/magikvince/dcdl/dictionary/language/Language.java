package fr.magikvince.dcdl.dictionary.language;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Language {

	@Id
	public String codeLanguage;
	public String language;
	public int IdAuthor;
	
	public Language()
	{
		
	}
	
	public Language(int author, String code, String language)
	{
		this.IdAuthor = author;
		this.codeLanguage = code;
		this.language = language;
	}

	public String getCodeLanguage() {
		return codeLanguage;
	}

	public void setCodeLanguage(String code) {
		this.codeLanguage = code;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getIdAuthor() {
		return IdAuthor;
	}

	public void setIdAuthor(int idAuthor) {
		IdAuthor = idAuthor;
	}
	
	
	
}
