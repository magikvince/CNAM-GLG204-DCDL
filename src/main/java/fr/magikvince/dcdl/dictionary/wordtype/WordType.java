package fr.magikvince.dcdl.dictionary.wordtype;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import fr.magikvince.dcdl.dictionary.language.Language;

@Entity
@Table(name="T_WORDTYPE")
public class WordType {
	
	@Id
	private int idWordType;
	private String wordType;
	private Language language;
	
	public WordType()
	{
		
	}

	public int getIdWordType() {
		return idWordType;
	}

	public void setIdWordType(int idWordType) {
		this.idWordType = idWordType;
	}

	public String getWordType() {
		return wordType;
	}

	public void setWordType(String wordType) {
		this.wordType = wordType;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}
	
}
