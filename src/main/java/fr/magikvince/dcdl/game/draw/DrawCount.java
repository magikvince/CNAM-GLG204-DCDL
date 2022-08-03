package fr.magikvince.dcdl.game.draw;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DrawCount extends Draw {

	private int Count;
	
	private List<Integer> numbers;
	private final int maxNumbers = 6;
	
	public DrawCount()
	{
		this.numbers = new ArrayList<>();
		
	}
	
	public Integer getNumberOfOccurrencesInList(int number)
	{
		int count = 0;
		
		while (numbers.iterator().hasNext())
		{
			if (numbers.iterator().next() == number)
				count ++;
		}
		
		return count;
	}
	
	@Override
	public void randomDraw() 
	{
		
		this.Count = RandomNumber.generateRandomCount();
		
		int newNumber = 0;
		int numberOfOccurences = 0;
		
		while (numbers.size() < maxNumbers)
		{
			newNumber = RandomNumber.generateRandomNumber();
			
			//before to add a new number to the numbers list, we have to check if there are not already 2 occurences of this number !
			numberOfOccurences = getNumberOfOccurrencesInList(newNumber); 
			
			if (numberOfOccurences < 2 )
				numbers.add(newNumber);
		}

	}
	
	

}
