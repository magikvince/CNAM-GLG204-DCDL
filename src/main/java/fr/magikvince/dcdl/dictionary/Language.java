package fr.magikvince.dcdl.dictionary;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Language {

	@Id
	public String code;
	public String language;
	public Author author;
	
	public Language(Author author, String code, String language)
	{
		this.author = author;
		this.code = code;
		this.language = language;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	
}
