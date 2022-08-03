package fr.magikvince.dcdl.game.draw;

import java.util.Random;
import java.util.List;

public class Vowel {
	
	private static final List<String> vowels = List.of("a", "e", "i", "o", "u", "y");
	private static final int numberOfVowels = 6;

	private static Random random;
	
	private static int lastRandomNumber;
	private static String lastRandomVowel;
	
	public static String generateRandomLetter()
	{
		//Returns a pseudorandom, uniformly distributed int value between 0 (inclusive) and the specified value (exclusive), 
		//drawn from this random number generator's sequence.
		random = new Random();
		int position = random.nextInt(numberOfVowels);
		
		lastRandomNumber = position;
		lastRandomVowel = vowels.get(position);
		
		return vowels.get(position);
	}

	public static List<String> getVowels() {
		return vowels;
	}
	
	public static void displayVowels()
	{
		System.out.println( "Vowels = " + vowels.toString());
		
	}
	
	public static void displaylastRandomLetter()
	{
		System.out.println("last random number : "+ lastRandomNumber);
		System.out.println("last random vowel : "+ lastRandomVowel);
	}

}
