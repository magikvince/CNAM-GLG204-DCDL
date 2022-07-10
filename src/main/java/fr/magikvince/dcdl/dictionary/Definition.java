package fr.magikvince.dcdl.dictionary;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Definition {
	
	@Id
	public int idDefinition;
	public int idAuthor;
	public int idWord;
	public String definition;
	
	
	public Definition (int author, int word, String definition)
	{
		this.idAuthor = author;
		this.idWord = word;
		this.definition = definition;
	}


	public int getIdDefinition() {
		return idDefinition;
	}


	public void setIdDefinition(int idDefinition) {
		this.idDefinition = idDefinition;
	}


	public int getIdAuthor() {
		return idAuthor;
	}


	public void setIdAuthor(int idAuthor) {
		this.idAuthor = idAuthor;
	}


	public int getIdWord() {
		return idWord;
	}


	public void setIdWord(int idWord) {
		this.idWord = idWord;
	}


	public String getDefinition() {
		return definition;
	}


	public void setDefinition(String definition) {
		this.definition = definition;
	}

	
}
