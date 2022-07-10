package fr.magikvince.dcdl.dictionary;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dictionary {
	
	@Id
	public int idDictionary;
	public String codeLanguage;
	public int idAuthor;
	public String name;
	public String description;
	
	public Dictionary(int author, String language, String name, String description)
	{
		this.idAuthor = author;
		this.codeLanguage = language;
		this.name = name;
		this.description = description;
	}

	public int getIdDictionary() {
		return idDictionary;
	}

	public void setIdDictionary(int idDictionary) {
		this.idDictionary = idDictionary;
	}

	public String getCodeLanguage() {
		return codeLanguage;
	}

	public void setCodeLanguage(String codeLanguage) {
		this.codeLanguage = codeLanguage;
	}

	public int getIdAuthor() {
		return idAuthor;
	}

	public void setIdAuthor(int idAuthor) {
		this.idAuthor = idAuthor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
