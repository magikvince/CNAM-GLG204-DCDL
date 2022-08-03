package fr.magikvince.dcdl.game.draw;

import java.util.Random;

public class Letter {
	
	/** a letter is either a vowel or a consonent ! **/

	private LetterType type;
	private String text;
	
	public Letter(LetterType type)
	{
		this.type = type;
		this.generateRandomLetter();
	}
	
	public LetterType getType() {
		return type;
	}

	public void setType(LetterType type) {
		this.type = type;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void generateRandomLetter()
	{
		switch (type) {
		
		case VOWEL : setText(Vowel.generateRandomLetter()); break;
		case CONSONENT : setText(Consonent.generateRandomLetter()); break;
		default: 
			break;
		}
	}
	
	public boolean isVowel()
	{
		return Vowel.getVowels().contains(text);
	}
	
	public boolean isConsonent()
	{
		return Consonent.getConsonents().contains(text);
	}
	
}
