package fr.magikvince.dcdl.dictionary.language;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import fr.magikvince.dcdl.dictionary.author.Author;

@Entity
public class Language {

	@Id
	@Column(name="code_language")
	public String codeLanguage;
	public String language;
	
	@ManyToOne
	@JoinColumn(name="id_author_fk")
	public Author author;
	
	public Language()
	{
		
	}
	
	public Language(Author author, String code, String language)
	{
		this.author = author;
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

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
	
}
