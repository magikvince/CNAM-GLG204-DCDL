package fr.magikvince.dcdl.game.draw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DrawCount extends Draw {

	private int count;
	private List<Integer> numbers;
	
	private final int maxNumbers = 6;
	
	public DrawCount()
	{
		this.numbers = new ArrayList<>();
		
	}
	
	public int getCount() {
		return count;
	}


	//only for Test classes
	public void setCount(int count) {
		this.count = count;
	}

	public List<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<Integer> numbers) {
		this.numbers = numbers;
	}

	//a revoir !!!! boucle infinie???
	
	public Integer getNumberOfOccurrencesInList(int number)
	{
		int occurenceCount = 0;

		Iterator<Integer> iter = numbers.iterator();
		int index = 0;
		
		//System.out.println(toString());
		//System.out.println("checking number of occurrences in list for value =  " + number);
		
		while (iter.hasNext())
		{
			int element = iter.next();
			//System.out.println("getNumberOfOccurrencesInList : index = " + index + ", element = "+ element);
			//System.out.println("comparing element to number : is " + element + " == " + number + " ?");
			
			if ( element == number)
			{
				occurenceCount ++;
				//System.out.println("number and element match : increasing occurenceCount : " + occurenceCount );
			}
				
			index++;
			if ( occurenceCount >= 2 )
			{
				//System.out.println("count is superior or equal to 2 : " + occurenceCount);
				//no need to continue checking other elements
				return occurenceCount;
			}
		}
		
		//System.out.println("final occurences count for number '" + number + "' = " + occurenceCount);
		return occurenceCount;
	}
	
	public void randomCount()
	{
		
		while ( count <= 99)
		{
			this.count = RandomNumber.generateRandomCount();
		}
	}
	
	public void randomNumbers()
	{
		int newNumber = 0;
		int numberOfOccurrences = 0;
		
		while (numbers.size() < maxNumbers)
		{
			newNumber = RandomNumber.generateRandomNumber();
			
			if (numbers.contains(newNumber))
			{
				//before to add a new number to the numbers list, we have to check it doesn't already contain 2 occurrences of this number !
				numberOfOccurrences = getNumberOfOccurrencesInList(newNumber); 
			
				if (numberOfOccurrences < 2 )
					numbers.add(newNumber);
			}
			else // number not present so we can add it !
				numbers.add(newNumber);
		}
	}
	
	@Override
	public void randomDraw() 
	{
		randomCount();
		randomNumbers();

	}
	
	public String toString()
	{
		String result = "count : " + this.count + ", numbers : ";
		
		for (Integer number : numbers)
		{
			result += number + " ";
		}
				
		return result;
	}
}
