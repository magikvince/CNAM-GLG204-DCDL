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
	
	
	public List<Letter> getLetters() {
		return letters;
	}

	public void setLetters(List<Letter> letters) {
		this.letters = letters;
	}

	public int getWishedVowels() {
		return wishedVowels;
	}

	public void setWishedVowels(int wishedVowels) {
		this.wishedVowels = wishedVowels;
	}



	@Override
	/** drawing 10 letters and adding them to the letters list 
	 * @throws Exception **/
	
	public void randomDraw() throws DrawException {
		
		int randomLetterType = 0;
		for ( int i = 0 ; i < maxLetters ; i ++)
		{
			//if we don't have the number of wishVowels, we choose randomly between consonent or vowel
			if ( this.currentNumberOfVowels < this.wishedVowels)
			{
				randomLetterType = random.nextInt(2);
				if (randomLetterType == 0 )
				{
					letters.add(new Letter(LetterType.VOWEL) );
					currentNumberOfVowels ++;
				}
				else if (randomLetterType == 1 )
					letters.add(new Letter(LetterType.CONSONENT));
			
				else
					throw new DrawException("unexpected value : " + randomLetterType);
					
			}
			else
				letters.add(new Letter(LetterType.CONSONENT));

		}

	}

}
