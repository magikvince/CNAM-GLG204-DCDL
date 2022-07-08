package fr.magikvince.dcdl.dictionary;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Word {
	
	@Id
	private int idWord;
	private Author author;
	private String word;
	private Dictionary dictionary;
	private Date creationDate;
	
	public Word(Dictionary dictionary, Author author, String word)
	{
		this.setDictionary(dictionary);
		this.author = author;
		this.word = word;
		this.creationDate = new Date();
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Dictionary getDictionary() {
		return dictionary;
	}

	public void setDictionary(Dictionary dictionary) {
		this.dictionary = dictionary;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

}
