package fr.magikvince.dcdl.dictionary;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Definition {
	
	@Id
	public int idDefinition;
	public Author author;
	public Word word;
	public String definition;
	
	
	public Definition (Author author, Word word, String definition)
	{
		this.author = author;
		this.word = word;
		this.definition = definition;
	}


	public int getIdDefinition() {
		return idDefinition;
	}


	public void setIdDefinition(int idDefinition) {
		this.idDefinition = idDefinition;
	}


	public Author getAuthor() {
		return author;
	}


	public void setAuthor(Author author) {
		this.author = author;
	}


	public Word getWord() {
		return word;
	}


	public void setWord(Word word) {
		this.word = word;
	}


	public String getDefinition() {
		return definition;
	}


	public void setDefinition(String definition) {
		this.definition = definition;
	}
	
	
	
}
