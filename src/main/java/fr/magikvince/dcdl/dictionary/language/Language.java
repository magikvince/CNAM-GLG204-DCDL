package fr.magikvince.dcdl.dictionary.language;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import fr.magikvince.dcdl.dictionary.author.Author;

@Entity
@Table(name = "T_LANGUAGE")
public class Language {

	@Id
	@Column(name="id_language")
	private int idLanguage;
		
	@Column(name="code_language")
	private String codeLanguage;
	
	@Column(name="language")
	private String textLanguage;
	
	@ManyToOne
	@JoinColumn(name="id_author_fk")
	private Author author;
	
	public Language()
	{
		
	}
	
	public Language(Author author, String code, String language)
	{
		this.author = author;
		this.codeLanguage = code;
		this.textLanguage = language;
	}

	public int getIdLanguage() {
		return idLanguage;
	}

	public void setIdLanguage(int idLanguage) {
		this.idLanguage = idLanguage;
	}

	public String getCodeLanguage() {
		return this.codeLanguage;
	}

	public void setCodeLanguage(String codeLanguage) {
		this.codeLanguage = codeLanguage;
	}

	
	
	public String getTextLanguage() {
		return textLanguage;
	}

	public void setTextLanguage(String textLanguage) {
		this.textLanguage = textLanguage;
	}

	public Author getAuthor() {
		return this.author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	
}
