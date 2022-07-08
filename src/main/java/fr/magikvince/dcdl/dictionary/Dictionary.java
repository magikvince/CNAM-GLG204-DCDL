package fr.magikvince.dcdl.dictionary;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dictionary {
	
	@Id
	public int idDictionary;
	public Language language;
	public Author author;
	public String dictionaryName;
	public String description;
	
	public Dictionary(Author author, Language language, String dictionaryname, String description)
	{
		this.language = language;
		this.dictionaryName = dictionaryname;
		this.description = description;
	}


	
	public int getIdDictionary() {
		return idDictionary;
	}


	public void setIdDictionary(int idDictionary) {
		this.idDictionary = idDictionary;
	}
	
	

	public Author getAuthor() {
		return author;
	}



	public void setAuthor(Author author) {
		this.author = author;
	}



	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	

	public String getDictionaryName() {
		return dictionaryName;
	}



	public void setDictionaryName(String dictionaryName) {
		this.dictionaryName = dictionaryName;
	}



	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
}
