package fr.magikvince.dcdl.game.draw;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DrawLetter extends Draw {


	private List<Letter> letters;
	private Random random;
	private final int maxLetters = 10;
	private int currentNumberOfVowels;
	private int wishedVowels;
	
	public DrawLetter(int wishedVowels)
	{

		this.letters = new ArrayList<>();
		
		this.wishedVowels = wishedVowels;
		this.currentNumberOfVowels = 0;

		this.random = new Random();
	}
	
	@Override
	/** drawing 10 letters and adding them to the letters list **/
	public void randomDraw() {
		
		
		for ( int i = 0 ; i < maxLetters ; i ++)
		{
			//if we don't have the number of wishVowels, we choose randomly between consonet or vowel
			if ( this.currentNumberOfVowels < this.wishedVowels)
			{
				random.nextInt(2);
			}
			random.nextInt();
		}
		
		

	}

}
