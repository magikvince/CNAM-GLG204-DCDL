package fr.magikvince.dcdl.game.draw;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class VowelTest {
	
	@Test
	public void generateRandomLetter()
	{
		String vowel1 = Vowel.generateRandomLetter();
		assertNotNull(vowel1);
		
		Vowel.displayVowels();
		Vowel.displaylastRandomLetter();
		
		String vowel2 = Vowel.generateRandomLetter();
		assertNotNull(vowel2);
		
		Vowel.displayVowels();
		Vowel.displaylastRandomLetter();
		
		String vowel3 = Vowel.generateRandomLetter();
		assertNotNull(vowel3);
		
		Vowel.displayVowels();
		Vowel.displaylastRandomLetter();
	}

}
