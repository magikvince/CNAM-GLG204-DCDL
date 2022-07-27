package fr.magikvince.dcdl.dictionary.wordtype;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import fr.magikvince.dcdl.dictionary.author.Author;
import fr.magikvince.dcdl.dictionary.language.Language;

@Entity
@Table(name="T_WORDTYPE")
public class WordType {
	
	@Id
	private int idWordType;
	
	private Author author;
	private Language language;
	private String textWordType;
	
	
	
	public WordType()
	{
		
	}

	public int getIdWordType() {
		return idWordType;
	}

	public void setIdWordType(int idWordType) {
		this.idWordType = idWordType;
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


	public String getTextWordType() {
		return textWordType;
	}

	public void setTextWordType(String textWordType) {
		this.textWordType = textWordType;
	}

	
}
