package fr.magikvince.dcdl.game.draw;

import java.util.Random;
import java.util.List;

public class Consonent {
	
	private static final List<String> consonents = List.of("b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "z");
	private static final int numberOfConsonents = 20;
	
	private static Random random;
	
	private static int lastRandomNumber;
	private static String lastRandomConsonent;
	
	public static String generateRandomLetter()
	{
		
		random = new Random();
		
		int position = random.nextInt(numberOfConsonents);
		
		lastRandomNumber = position;
		lastRandomConsonent = consonents.get(position);
		
		return lastRandomConsonent;
	}
	
	public static void displayConsonents()
	{
		System.out.println( "Consonents = " + consonents.toString());
		
	}
	
	public static void displaylastRandomLetter()
	{
		System.out.println("last random number : "+ lastRandomNumber);
		System.out.println("last random consonent : "+ lastRandomConsonent);
	}

}
