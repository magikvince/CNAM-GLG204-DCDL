package fr.magikvince.dcdl.game.draw;

import java.util.List;
import java.util.Random;


public class RandomNumber {
	
	private static final List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 25, 50, 100);
	
	private static final int numberOfItems = 13;
	
	private static Random random;
	
	private static int lastRandomIndex;
	private static int lastRandomNumber;
	
	
	public static Integer generateRandomNumber()
	{
		
		random = new Random();
		
		int position = random.nextInt(numberOfItems);
		
		lastRandomIndex = position;
		lastRandomNumber = numbers.get(position);
		
		return lastRandomNumber;
	}
	
	public static Integer generateRandomCount()
	{		
		random = new Random();
		return random.nextInt(999);
	}
	
	public static void displayNumbers()
	{
		System.out.println( "Numbers = " + numbers.toString());
		
	}
	
	public static void displaylastRandomNumber()
	{
		System.out.println("last random index : " + lastRandomIndex);
		System.out.println("last random number : " + lastRandomNumber);
	}

}