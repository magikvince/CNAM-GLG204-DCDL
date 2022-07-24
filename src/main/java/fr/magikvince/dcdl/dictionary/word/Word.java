package fr.magikvince.dcdl.dictionary.word;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import fr.magikvince.dcdl.dictionary.author.Author;
import fr.magikvince.dcdl.dictionary.dictionary.Dictionary;

@Entity
@Table(name="T_WORD")
public class Word {
	
	@Id
	private int idWord;
	
	@ManyToOne
	@JoinColumn(name="id_author_fk")
	private Author author;
	
	@ManyToOne
	@JoinColumn(name="id_dictionary_fk")
	private Dictionary dictionary;
	
	private String word;
	private Date creationDate;
	
	public Word(Dictionary dictionary, Author author, String word)
	{
		this.dictionary = dictionary;
		this.author = author;
		this.word = word;
		this.creationDate = new Date();
	}

	public Word() {
	}

	public int getIdWord() {
		return idWord;
	}

	public void setIdWord(int idWord) {
		this.idWord = idWord;
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
