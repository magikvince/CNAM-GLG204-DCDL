package fr.magikvince.dcdl.dictionary.word;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WordType {
	
	@Id
	private int idWordType;
	private String wordType;
	
	public WordType()
	{
		
	}
	
}
