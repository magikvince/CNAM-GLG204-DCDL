package fr.magikvince.dcdl.game.draw;

import java.util.Random;
import java.util.List;

public class Vowel {
	
	private static final List<String> vowels = List.of("a", "e", "i", "o", "u", "y");
	private static final int numberOfVowels = 6;

	private static Random random;
	
	public static String generateRandomLetter()
	{
		//Returns a pseudorandom, uniformly distributed int value between 0 (inclusive) and the specified value (exclusive), 
		//drawn from this random number generator's sequence.
		random = new Random();
		int position = random.nextInt(numberOfVowels);
		
		return vowels.get(position);
	}


}
