package fr.magikvince.dcdl.dictionary.word;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_WORDTYPE")
public class WordType {
	
	@Id
	private int idWordType;
	private String wordType;
	
	public WordType()
	{
		
	}
	
}
