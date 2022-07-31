package fr.magikvince.dcdl.game.draw;

public class Letter {
	
	/** a letter is either a vowel or a consonent ! **/
	private enum type {
		VOWEL,
		CONSONENT
	}
	
	private String value;

	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
