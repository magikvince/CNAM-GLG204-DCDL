package fr.magikvince.dcdl.dictionary.word;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Word {
	
	@Id
	private int idWord;
	private int idAuthor;
	private int IdDictionary;
	private String word;
	private Date creationDate;
	
	public Word(int dictionary, int author, String word)
	{
		this.IdDictionary = dictionary;
		this.idAuthor = author;
		this.word = word;
		this.creationDate = new Date();
	}

	public int getIdWord() {
		return idWord;
	}

	public void setIdWord(int idWord) {
		this.idWord = idWord;
	}

	public int getIdAuthor() {
		return idAuthor;
	}

	public void setIdAuthor(int idAuthor) {
		this.idAuthor = idAuthor;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public int getIdDictionary() {
		return IdDictionary;
	}

	public void setIdDictionary(int idDictionary) {
		IdDictionary = idDictionary;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	
}
