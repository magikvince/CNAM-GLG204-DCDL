package fr.magikvince.dcdl.dictionary.dictionary;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import fr.magikvince.dcdl.dictionary.author.Author;
import fr.magikvince.dcdl.dictionary.language.Language;

@Entity
@Table(name="T_DICTIONARY")
public class Dictionary {
	
	@Id
	private int idDictionary;
	
	@ManyToOne
	@JoinColumn(name="id_author_fk")
	private Author author;
	
	@ManyToOne
	@JoinColumn(name="id_language_fk")
	private Language language;
	
	private String name;
	private String description;
	
	public Dictionary(Author author, Language language, String name, String description)
	{
		this.author = author;
		this.language = language;
		this.name = name;
		this.description = description;
	}

	public Dictionary() {
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
