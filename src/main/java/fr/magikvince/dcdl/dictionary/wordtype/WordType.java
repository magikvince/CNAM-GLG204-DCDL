package fr.magikvince.dcdl.dictionary.wordtype;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import fr.magikvince.dcdl.dictionary.author.Author;
import fr.magikvince.dcdl.dictionary.language.Language;

@Entity
@Table(name="T_WORD_TYPE")
public class WordType {
	
	@Id
	private int idWordType;
	
	@ManyToOne
	@JoinColumn(name="id_author_fk")
	private Author author;
	
	@ManyToOne
	@JoinColumn(name="code_language_fk")
	private Language language;
	
	@Column(name="word_type")
	private String textWordType;
	
	public WordType(Author author, Language language, String wordtype)
	{
		this.author = author;
		this.language = language;
		this.textWordType = wordtype;
	}
	
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
