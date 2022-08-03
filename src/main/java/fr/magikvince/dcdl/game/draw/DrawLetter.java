package fr.magikvince.dcdl.game.draw;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DrawLetter extends Draw 
{
	private List<Letter> letters;
	private Random random;
	private final int maxLetters = 10;
	private int wishedVowels;
	private int wishedConsonents;
	
	public DrawLetter(int wishedVowels)
	{

		this.letters = new ArrayList<>();
		
		this.wishedVowels = wishedVowels;
		this.wishedConsonents = this.maxLetters - this.wishedVowels; 
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
	
	public void randomDraw() throws DrawException 
	{
		int randomLetterType = 0;
		int currentNumberOfVowels = 0;
		int currentNumberOfConsonents = 0;
		
		for ( int i = 0 ; i < maxLetters ; i ++)
		{
			//if we don't have the number of wishedVowels and number of wishedConsonents, we choose randomly between consonent or vowel
			if (( currentNumberOfVowels < this.wishedVowels) && ( currentNumberOfConsonents < this.wishedConsonents))
			{
					randomLetterType = random.nextInt(2);
					
					if (randomLetterType == 0 )
					{
						letters.add(new Letter(LetterType.VOWEL) );
						currentNumberOfVowels ++;
					}
					else if (randomLetterType == 1 )
					{
						letters.add(new Letter(LetterType.CONSONENT));
						currentNumberOfConsonents ++;
					}
				
					else
						throw new DrawException("unexpected value : " + randomLetterType);
			}
			
			//we already have all consonents, so let's add a vowel !
			else if (( currentNumberOfVowels < this.wishedVowels) && ( currentNumberOfConsonents == this.wishedConsonents))
			{
				letters.add(new Letter(LetterType.VOWEL));
				currentNumberOfVowels ++;
			}
					
			// we already have all vowels, so let's add a consonent!
			else if (( currentNumberOfVowels == this.wishedVowels) && ( currentNumberOfConsonents < this.wishedConsonents))
			{
				letters.add(new Letter(LetterType.CONSONENT));
				currentNumberOfConsonents ++;
			}
		}//end for

	}
	
	/** return number of consonents from the letters List **/
	public int getNumberOfConsonents()
	{
		int number = 0;
		
		for (Letter letter : letters)
		{
			if (letter.isConsonent())
				number++;
		}
		return number;
	}
	
	/** return number of vowels from the letters List **/
	public int getNumberOfVowels()
	{
		int number = 0;
		
		for (Letter letter : letters)
		{
			if (letter.isVowel())
				number++;
		}
		return number;
	}
	
	public String toString()
	{
		String draw = "";
		
		for ( Letter letter : letters)
		{
			if (letters.iterator().hasNext())
				draw += letter.getText() + " ";
			else
				draw += letter.getText();
		}
		return draw;
		
	}

}
