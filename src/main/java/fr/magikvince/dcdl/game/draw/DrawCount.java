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
	
	public int getCount() {
		return Count;
	}


	public void setCount(int count) {
		Count = count;
	}



	public List<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<Integer> numbers) {
		this.numbers = numbers;
	}



	public Integer getNumberOfOccurrencesInList(int number)
	{
		int count = 0;
		
		//a revoir !!!!
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
		int numberOfOccurrences = 0;
		
		while (numbers.size() < maxNumbers)
		{
			newNumber = RandomNumber.generateRandomNumber();
			
			if (numbers.contains(newNumber))
			{
				//before to add a new number to the numbers list, we have to check if there are not already 2 occurrences of this number !
				numberOfOccurrences = getNumberOfOccurrencesInList(newNumber); 
			
				if (numberOfOccurrences < 2 )
					numbers.add(newNumber);
			}
			else // number not present so we can add it !
				numbers.add(newNumber);
				
		}

	}
	
	

}
